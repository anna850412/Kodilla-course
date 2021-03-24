package com.kodilla.patterns2.decorator;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    void basicPizzaGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal thePrice = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15), thePrice);
    }
    @Test
    void basicPizzaGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza (cake, tomato sauce, cheese) with ", description);
    }
    @Test
    void testPizzaWithExtraCheeseGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheese(pizzaOrder);
        //When
        BigDecimal thePrice = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(20.00), thePrice);
    }
    @Test
    void testPizzaWithExtraCheeseGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheese(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza (cake, tomato sauce, cheese) with extra cheese", description);
    }
    @Test
    void testPizzaWithExtraCheeseHamAndOnionGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheese(pizzaOrder);
        pizzaOrder = new PizzaWithHam(pizzaOrder);
        pizzaOrder = new PizzaWithOnion(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza (cake, tomato sauce, cheese) with extra cheese ham onion", description);
    }
    @Test
    void testPizzaWithExtraCheeseHamAndOnionGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheese(pizzaOrder);
        pizzaOrder = new PizzaWithHam(pizzaOrder);
        pizzaOrder = new PizzaWithOnion(pizzaOrder);
        //When
        BigDecimal price = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(27.00), price);
    }
    @Test
    void testPizzaWithExtraCheeseHamOlivesSalamiAndOnionGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheese(pizzaOrder);
        pizzaOrder = new PizzaWithHam(pizzaOrder);
        pizzaOrder = new PizzaWithOnion(pizzaOrder);
        pizzaOrder = new PizzaWithOlives(pizzaOrder);
        pizzaOrder = new PizzaWithSalami(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza (cake, tomato sauce, cheese) with extra cheese ham onion olives salami", description);
    }
    @Test
    void testPizzaWithExtraCheeseHamOlivesSalamiAndOnionGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheese(pizzaOrder);
        pizzaOrder = new PizzaWithHam(pizzaOrder);
        pizzaOrder = new PizzaWithOnion(pizzaOrder);
        pizzaOrder = new PizzaWithOlives(pizzaOrder);
        pizzaOrder = new PizzaWithSalami(pizzaOrder);
        //When
        BigDecimal price = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(35.00), price);
    }
}
