package com.company.tine_zones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Hrant on 10.04.2017.
 */
public class TimeZones {
    private ArrayList<TimeZone> zoneArrayList;

    public TimeZones()  throws IOException {
        this.zoneArrayList = new ArrayList<TimeZone>();
        readFromFile();
    }

    private void readFromFile() throws IOException{
        BufferedReader reader = null;
        String line;
        try {
            reader = new BufferedReader(new FileReader("zone.csv"));
        }
        catch (IOException e){
            System.out.println(e.toString());
            return;
        }
        while ((line = reader.readLine()) != null){
            String[] splittedLine =  line.split(",");
            for (int i = 0; i < splittedLine.length; i++) {
                splittedLine[i] = splittedLine[i].replace("\"", "");
            }
            TimeZone newTimeZone = new TimeZone(Integer.parseInt(splittedLine[0]), splittedLine[1], splittedLine[2]);
            zoneArrayList.add(newTimeZone);
        }
        reader.close();
    }

    public ArrayList<TimeZone> getZoneArrayList() {
        return zoneArrayList;
    }
}
