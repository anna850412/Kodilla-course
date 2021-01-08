package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    Set<String> findDepartureAirport;
    Set<String> findArrivalAirport;

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Set<Flight> findAirport = new HashSet<>();
        findAirport.add(new Flight("Warszawa", "Londyn"));
        findAirport.add(new Flight("Londyn", "Paryż"));
        findAirport.add(new Flight("Paryż", "Berlin"));
        findAirport.add(new Flight("Berlin", "Londyn"));
        findAirport.add(new Flight("Warszawa", "Berlin"));

        if(!findAirport.contains(flight.getArrivalAirport())){
            throw new RouteNotFoundException("Flight arrival airport is not on Airports list: " + flight.getArrivalAirport());
        } else if (!!findAirport.contains(flight.getDepartureAirport())){
            throw new RouteNotFoundException("Flight departure airport is not on Airports list:" + flight.getDepartureAirport());
        }   return findAirport.contains(flight);

    }
//    public Set<String> findArrivalAirport(){
//                findAirport.stream()
//                .map(n -> flight.getArrivalAirport())
//                .collect(Collectors.toSet());
//                return findArrivalAirport;
//    }
//    public Set<String> findDepartureAirport(){
//        Set<String> findDepartureAirport = findAirport.stream()
//                .map(m->flight.getDepartureAirport())
//                .collect(Collectors.toSet());
//        return findDepartureAirport;
//    }

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
