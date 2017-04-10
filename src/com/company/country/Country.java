package com.company.country;

/**
 * Created by Hrant on 10.04.2017.
 */
public class Country {
    private int id;
    private String countryCode;
    private String englishName;
    private String frenchName;
    private String armenianName;
    private String russianName;
    private String timeZone;

    public Country(int id, String countryCode, String englishName, String frenchName, String armenianName, String russianName, String timeZone) {
        this.id = id;
        this.countryCode = countryCode;
        this.englishName = englishName;
        this.frenchName = frenchName;
        this.armenianName = armenianName;
        this.russianName = russianName;
        this.timeZone = timeZone;
    }

    public String toString(){
        return String.format("%d, %s, %s, %s", id, countryCode, englishName, timeZone);
    }

    public int getId() {
        return id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getFrenchName() {
        return frenchName;
    }

    public String getArmenianName() {
        return armenianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public String getTimeZone() {
        return timeZone;
    }
}
