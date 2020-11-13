package com.kodilla.testing.calculator;
import com.kodilla.testing.calculator.Calculator;

import java.sql.SQLOutput;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result1 = calculator.addAtoB(5,3);
        int result2 = calculator.substractAfromB(2,1);
        if(result1 == (8) && result2 == (1)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Error");
        }
    }
}
