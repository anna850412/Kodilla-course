package com.kodilla.good.patterns.challenges.flight;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(final String message){
        super(message);
    }
}
