package com.company;

import com.company.country.Countries;
import com.company.country.Country;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException{
        Countries countries = new Countries();
        ArrayList<Country> countryList = countries.getCountriesList();

        for (Country country : countryList)
            System.out.println(country);

        countries.writeIntoFile();
    }
}
