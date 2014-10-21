package com.coderevisited.spring.framework.inception;

public class Address {

    private final String city;
    private final String country;
    private final int zipCode;

    public Address(String city, String country, int zipCode) {
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "[city:" + city + "]," + "[country:" + country + "]," + "[zipCode:" + zipCode + "]";
    }
}
