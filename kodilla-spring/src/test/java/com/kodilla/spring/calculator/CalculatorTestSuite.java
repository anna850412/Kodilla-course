package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    void testAddingCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double expectedResult = Double.valueOf(5);
        Double result = calculator.add(3, 2);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testSubtractingCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double expectedResult = Double.valueOf(1);
        Double result = calculator.sub(3, 2);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testDividingCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double expectedResult = Double.valueOf(2);
        Double result = calculator.div(6, 3);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testMultiplyingCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double expectedResult = Double.valueOf(4);
        Double result = calculator.mul(2, 2);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    void contextLoads(){

    }

}
