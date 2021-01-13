package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {
    @Autowired
    private Display display;

    public void addAtoB(){
    double val = display.add(3,2);
    System.out.println(val);
}
public void substractAFromB(){
    double val = display.sub(5,1);
    System.out.println(val);
}
public void multiplyAByB(){
    double val = display.mul(2,2);
    display.displayValue(val);
}
public void divideAbyB(){
    double val = display.div(6,2);
    display.displayValue(val);
}
}
