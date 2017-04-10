package com.company.country;

import com.company.tine_zones.TimeZone;
import com.company.tine_zones.TimeZones;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Hrant on 10.04.2017.
 */
public class Countries {
    private ArrayList<Country> countriesList;

    public Countries()  throws IOException {
        this.countriesList = new ArrayList<Country>();
        readFromFile();
    }

    private void readFromFile() throws IOException{
        BufferedReader reader = null;
        String line;
        try {
            reader = new BufferedReader(new FileReader("country.csv"));
        }
        catch (IOException e){
            System.out.println(e.toString());
            return;
        }
        int counter = 1;
        while ((line = reader.readLine()) != null){
            String[] splittedLine =  line.split(",");
            String timeZone = getTimeZone(splittedLine[0]);
            Country newCountry = new Country(counter, splittedLine[0], splittedLine[1], splittedLine[2], splittedLine[3], splittedLine[4], timeZone);
            countriesList.add(newCountry);
            counter++;
        }
        reader.close();
    }

    public void writeIntoFile() throws IOException{
        FileWriter fileWriter = new FileWriter("countryWithTimeZone.csv");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        ArrayList<Country> countryList = getCountriesList();
        for (Country country : countryList)
            writer.write(String.format("%d,%s,%s,%s\n", country.getId(), country.getCountryCode(), country.getEnglishName(), country.getTimeZone()));
        writer.close();
    }

    public String getTimeZone(String countryCode) throws IOException{
        TimeZones timeZones = new TimeZones();
        ArrayList<TimeZone> timeZoneArrayList = timeZones.getZoneArrayList();
        for (TimeZone timeZone : timeZoneArrayList)
            if(timeZone.getCountryCode().equals(countryCode)) return timeZone.getTimeZoneName();
        return null;
    }

    public ArrayList<Country> getCountriesList() {
        return countriesList;
    }
}
