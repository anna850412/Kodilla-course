package com.kodilla.exception.test;

public class ExceptionHandling {
    public void handleErrors(double x, double y) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("Probably will throw exception");
        } finally {
            System.out.println("Finally!");
        }
    }
}
