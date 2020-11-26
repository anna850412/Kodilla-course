package com.kodilla.exception.test.io;

import com.kodilla.exception.test.SecondChallenge;

public class Main {
    public static void main (String [] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1,1.5);
        } catch (Exception e){
            System.out.println("Ups");
        }
    }
}
