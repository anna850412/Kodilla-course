package com.kodilla.stream.calculator;

public class Calculator {

    public int calculate(int a, int b, CalculateExecutor numbers){
       int result = numbers.calculationOnTwoNumbers(a, b);
        return  result;
    }
}
