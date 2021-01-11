package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    Set<Flight> flights;

    public FlightFinder(Set<Flight> flights) {
        this.flights = flights;
    }

    public Set<Flight> findFlightFromAirport(String searchedDepartureAirport) {

        return flights.stream()
                .filter(n -> n.getDepartureAirport().equals(searchedDepartureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightToAirport(String searchedArrivalAirport) {

        return flights.stream()
                .filter(n -> n.getArrivalAirport().equals(searchedArrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findStopoverAirport(String searchedDepartureAirport, String searchedArrivalAirport) {
        Set<Flight> startFlights = findFlightFromAirport(searchedDepartureAirport).stream()
                .filter(n -> !n.getArrivalAirport().equals(searchedArrivalAirport))
                .collect(Collectors.toSet());


        Set<Flight> endFlights = findFlightToAirport(searchedArrivalAirport).stream()
                .filter(n -> !n.getDepartureAirport().equals(searchedDepartureAirport))
                .collect(Collectors.toSet());

        Set<Flight> firstPartOfTrip = startFlights.stream()
                .filter(flight -> endFlights.stream()
                        .map(t -> t.getDepartureAirport())
                        .collect(Collectors.toList()).contains(flight.getArrivalAirport()))
                .collect(Collectors.toSet());
        Set<Flight> secondPartOfTrip = endFlights.stream()
                .filter(flight -> startFlights.stream()
                        .map(t -> t.getArrivalAirport())
                        .collect(Collectors.toList()).contains(flight.getDepartureAirport()))
                .collect(Collectors.toSet());
        return new HashSet<>() {{
            addAll(secondPartOfTrip);
            addAll(firstPartOfTrip);
        }};
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
