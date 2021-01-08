package com.kodilla.good.patterns.challenges.flight;

public class FlightApplication {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight = new Flight("Paryż", "Poznań");
        FlightFinder flightFinder = new FlightFinder();
        try {
            System.out.println("Szukam lotu dla: " + " " + flight);
            boolean result = flightFinder.findFlight(flight);
            if (result) {
                System.out.println("Lot znaleziono i jest takie połączenie");
            } else {
                System.out.println("Nie ma takiego lotu");
            }
        } catch (RouteNotFoundException e) {
            if(!flight.getArrivalAirport()) {
                System.out.println("Selected Arrival Airport is not available: " + " " + flight.getArrivalAirport());
            } else if(!flight.getDepartureAirport()){
                System.out.println("Selected Departure Airport is not available: " + " " + flight.getDepartureAirport());
            }
        } catch (NullPointerException e) {
            System.out.println("We got Null pointer exception");
        } finally {
            System.out.println("Flight finder ended");
        }
    }
}
