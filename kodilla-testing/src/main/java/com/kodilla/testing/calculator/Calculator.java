package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int addAtoB(int a, int b){
        return a + b;
    }
    public int substractAfromB(int a, int b){
        return a - b;
    }
}
