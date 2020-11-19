package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public final BigDecimal getPeopleQuantity(){
        return this.peopleQuantity;
    }

//public List<Country> getCountryPopulation(){
//        return countryPopulation.stream()
//                .map(Country::getPeopleQuantity)
//                .collect(Collectors.toList());
//}
//    public List<Continent> getContinentPopulation(){
//        return continentPopulation.stream()
//                .map(Continent::getPeopleQuantity)
//                .collect(Collectors.toList());
    }

