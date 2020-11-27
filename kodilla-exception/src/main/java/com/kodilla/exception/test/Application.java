package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Miami", "Warszawa");
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlight(flight);
//        System.out.println(flight.getArrivalAirport());
//        System.out.println(flight.getDepartureAirport());
//

    }
}