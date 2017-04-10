package com.company.tine_zones;

/**
 * Created by Hrant on 10.04.2017.
 */
public class TimeZone {
    private int id;
    private String countryCode;
    private String timeZoneName;

    public TimeZone(int id, String countryCode, String timeZoneName) {
        this.id = id;
        this.countryCode = countryCode;
        this.timeZoneName = timeZoneName;
    }

    public String toString(){
        return String.format("%d, %s, %s", id, countryCode, timeZoneName);
    }

    public int getId() {
        return id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }
}
