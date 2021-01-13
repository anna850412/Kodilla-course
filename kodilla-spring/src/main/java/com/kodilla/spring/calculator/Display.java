package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public Display displayValue(double val){
        System.out.println("Display value of calculation: " + val);
        return displayValue(val);
    }

    public void displayValue() {
    }
}
