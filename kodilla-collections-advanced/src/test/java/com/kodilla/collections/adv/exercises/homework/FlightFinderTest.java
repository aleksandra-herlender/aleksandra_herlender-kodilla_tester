package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    private List<Flight> flightsFromWroclaw(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Wroclaw", "Paris"));
        flights.add(new Flight("Wroclaw", "Berlin"));
        flights.add(new Flight("Wroclaw", "Madrid"));
        return flights;
    }

    private List<Flight> flightsToWroclaw(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Paris", "Wroclaw"));
        flights.add(new Flight("Madrid", "Wroclaw"));
        flights.add(new Flight("Berlin", "Wroclaw"));
        return flights;
    }

    @Test
    public void findFlightsFromWroclaw(){
        FlightFinder flightFinder = new FlightFinder();
        assertEquals(flightsFromWroclaw(),flightFinder.findFlightsFrom("Wroclaw"));
    }

    @Test
    public void findFlightFromPrague(){
        FlightFinder flightFinder = new FlightFinder();
        assertEquals(new ArrayList<Flight>(), flightFinder.findFlightsFrom("Prague"));
    }

    @Test
    public void findFlightsToWroclaw(){
        FlightFinder flightFinder = new FlightFinder();
        assertEquals(flightsToWroclaw(),flightFinder.findFlightsTo("Wroclaw"));
    }

    @Test
    public void findFlightToPrague(){
        FlightFinder flightFinder = new FlightFinder();
        assertEquals(new ArrayList<Flight>(), flightFinder.findFlightsTo("Prague"));
    }

}