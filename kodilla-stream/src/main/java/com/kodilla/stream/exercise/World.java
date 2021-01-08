package com.kodilla.stream.exercise;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private List<Continent> continents;
    public World(List<Continent> continents){
        this.continents = continents;
    }
    public List<Continent> getContinents(){
        return this.continents;
    }
public void addContinent(Continent continent){
        continents.add(continent);
}
public BigDecimal getPopeleQuantity() {
        BigDecimal totalPeople = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum =sum.add(current));
    return totalPeople;
}

}
