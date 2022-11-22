package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static final List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Wroclaw", "Paris"));
        flights.add(new Flight("Wroclaw", "Berlin"));
        flights.add(new Flight("Wroclaw", "Madrid"));
        flights.add(new Flight("Paris", "Wroclaw"));
        flights.add(new Flight("Madrid", "Wroclaw"));
        flights.add(new Flight("Berlin", "Wroclaw"));
        return flights;
    }
}
