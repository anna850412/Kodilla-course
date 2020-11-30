package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> findAirportMap = new HashMap<>();
        findAirportMap.put("Miami", true);
        findAirportMap.put("Texas", true);
        findAirportMap.put("Chicago", true);
        findAirportMap.put("Lodz", false);
        findAirportMap.put("NewYork", true);

                if(!findAirportMap.containsKey(flight.getDepartureAirport())){
                    throw new RouteNotFoundException("Flight departure airport is not on Airports list:" + flight.getDepartureAirport());
                }
                else if(!findAirportMap.containsKey(flight.getArrivalAirport())) {
                    throw new RouteNotFoundException("Flight arrival airport is not on Airports list: " + flight.getArrivalAirport());
                }
        return findAirportMap.get(flight.getArrivalAirport());
    }
    }
