package com.kodilla.stream.exercise;

import java.util.List;

public class Continent {
    private final String continentName;
    private List<Country> countries;
    public Continent (final String continentName, final List<Country> countries){
        this.continentName = continentName;
        this.countries = countries;
    }
    public String getContinentName(){
        return this.continentName;
    }
    public List<Country> getCountries(){
        return countries;
    }
    public void setCountries(List<Country> countries){
        this.countries = countries;
    }
    public void addCountry(Country country){
        countries.add(country);
    }
}
