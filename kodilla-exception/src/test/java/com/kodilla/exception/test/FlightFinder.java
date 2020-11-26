package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> findAirportMap = new HashMap<>();
        findAirportMap.put("Miami", true);
        findAirportMap.put("Texas", true);
        findAirportMap.put("Chicago", true);
        findAirportMap.put("Lodz", false);
        findAirportMap.put("NewYork", true);

        List<String> allAirports = new ArrayList<>();
            for (Map.Entry<String, Boolean> entry : findAirportMap.entrySet()) {
                System.out.println("Airport: " + entry.getKey() + "Exists: " + entry.getValue());
                allAirports.add(entry.getKey());
            }

                if(!allAirports.contains(flight.getDepartureAirport())){
                    throw new RouteNotFoundException("Flight is not on list from Airport: " + flight.getDepartureAirport());
                }
                else if(!allAirports.contains(flight.getArrivalAirport())) {
                    throw new RouteNotFoundException("Flight is not on list to Airport: " + flight.getArrivalAirport());
                }

        }

    }
