package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Miami", "Lodz");
       // Flight flight1 = null;
        FlightFinder flightFinder = new FlightFinder();

        try {
            System.out.println("Szukam lotu dla: " + flight);
          boolean result = flightFinder.findFlight(flight);
          if(result){
              System.out.println("Lot znaleziono i jest takie połączenie.");
          } else {
              System.out.println("Lot znaleziono ale połączenie nie jest chwilowo dostępne.");
          }
    //      flightFinder.findFlight(flight1);

       } catch (RouteNotFoundException e){
           System.out.println("Selected Airport is not available");
       } catch (NullPointerException e) {
           System.out.println("We got Null pointer exception");
       }finally {
           System.out.println("Flight finder ended");
       }
    }
}