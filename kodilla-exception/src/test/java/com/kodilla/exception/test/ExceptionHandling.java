package com.kodilla.exception.test;

public class ExceptionHandling extends Exception{
    public static void main (String [] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e) {
            System.out.println("Probably will throw exception");
            ;
        } finally {
            System.out.println("Done!");
        }

    }}
