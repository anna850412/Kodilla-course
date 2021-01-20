package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll")
                .sauce("barbeque")
                .ingredient("olive")
                .ingredient("cheese")
                .burgers(3)
                .ingredient("onion")
                .ingredient("tomato")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredient = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(4, howManyIngredient);
    }
}