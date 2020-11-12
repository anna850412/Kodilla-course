package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import java.sql.SQLOutput;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        Calculator calculator = new Calculator(5,3);
        int result1 = calculator.addAtoB(5,3);
        int result2 = calculator.substractAfromB(5,3);
        if(result1 == (8) && result2 == (2)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Error");
        }
    }
}
