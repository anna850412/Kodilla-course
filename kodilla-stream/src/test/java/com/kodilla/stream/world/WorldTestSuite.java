package com.kodilla.stream.world;

import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @DisplayName("Verify if population on the World present proper value of" +
            "all the people from each Country")
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country china = new Country("China", new BigDecimal("1379000000"));
        Country india = new Country("India", new BigDecimal("1281000000"));
        Country russia = new Country("Russia", new BigDecimal("142000000"));
        Country usa = new Country("USA", new BigDecimal("32600000"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("105000000"));
        Country egypt = new Country("Egypt", new BigDecimal("97000000"));
        List <Country> asiaCounties = new ArrayList<>();
        asiaCounties.add(china);
        asiaCounties.add(india);
        asiaCounties.add(russia);
        List <Country> americaCountries = new ArrayList<>();
        americaCountries.add(usa);
        List <Country> africaCountries = new ArrayList<>();
        africaCountries.add(ethiopia);
        africaCountries.add(egypt);
        Continent asia = new Continent("Asia",asiaCounties);
        Continent africa = new Continent("Africa",africaCountries);
        Continent america = new Continent("America",americaCountries);


        List<Continent>  continents = new ArrayList<>();
        continents.add(america);
        continents.add(africa);
        continents.add(asia);

        World world = new World(continents);

        //When
       BigDecimal result = world.getPeopleQuantity();
       BigDecimal expectedResult = new BigDecimal("3036600000");

        //Then
        Assertions.assertEquals(expectedResult, result);

    }


}