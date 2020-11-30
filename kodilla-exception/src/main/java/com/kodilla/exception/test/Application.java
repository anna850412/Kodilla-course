package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Miami", "Warszawa");
        Flight flight1 = null;
        FlightFinder flightFinder = new FlightFinder();
       try {
          flightFinder.findFlight(flight);
          flightFinder.findFlight(flight1);

       } catch (RouteNotFoundException e){
           System.out.println("Selected Airport is not available");
       } catch (NullPointerException e) {
           System.out.println("We got Null pointer exception");
       }finally {
           System.out.println("Flight finder ended");
       }
    }
}