package com.kodilla.good.patterns.challenges.flight;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;
    private Integer flightNo;

    public Flight(String departureAirport, String arrivalAirport, Integer flightNo) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNo = flightNo;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight number: " + flightNo +
                " from: " + departureAirport +
                " to: " + arrivalAirport;
    }
}
