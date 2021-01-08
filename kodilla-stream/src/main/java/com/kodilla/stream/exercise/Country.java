package com.kodilla.stream.exercise;

import java.math.BigDecimal;

public class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;
    public Country(final String countryName, final BigDecimal peopleQuantity){
        this.countryName= countryName;
        this.peopleQuantity = peopleQuantity;

    }
  public final BigDecimal getPeopleQuantity(){
        return this.peopleQuantity;
  }
}
