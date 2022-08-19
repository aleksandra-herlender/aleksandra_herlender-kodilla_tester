package com.kodilla.inheritance;

public class Convertible extends Car {

    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public Convertible (int wheels, int seats) {
        super(wheels,seats);
        System.out.println("I am convertible");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }

    @Override
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }
}
