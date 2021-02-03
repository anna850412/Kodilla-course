package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightApplication {
    public static void main(String[] args)  {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Warszawa", "Londyn", 1));
        flights.add(new Flight("Londyn", "Paryż", 2));
        flights.add(new Flight("Paryż", "Berlin", 3));
        flights.add(new Flight("Berlin", "Londyn", 4));
        flights.add(new Flight("Warszawa", "Berlin", 5));
        flights.add(new Flight("Berlin", "Paryż", 6));

        FlightFinder flightFinder = new FlightFinder(flights);

        Set<Flight> flightsFromWarszawa = flightFinder.findFlightFromAirport("Warszawa");
        Set<Flight> flightsToBerlin = flightFinder.findFlightToAirport("Berlin");
        Set<Flight> flightsToParis = flightFinder.findFlightToAirport("Paryż");

        Set<Flight> flightsFromWarszawaToParyż = flightFinder.findStopoverAirport("Warszawa", "Paryż");
        System.out.println("Loty z Warszawy: ");
        System.out.println(flightsFromWarszawa);
        System.out.println("Loty do Berlina: ");
        System.out.println(flightsToBerlin);
        System.out.println("Loty z Warszawy do Paryża z przesiadką");
        System.out.println(flightsFromWarszawaToParyż);
        Set<Flight> forEachFindStopoverAirport = flightFinder.forEachFindStopoverAirport("Warszawa", "Paryż");
        System.out.println("Loty z Warszawy do Paryża z przesiadką z użyciem pętli");
        System.out.println(forEachFindStopoverAirport);

    }
}
