package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Opel opel = new Opel();
        VW vw = new VW();
        Toyota toyota = new Toyota();
        doRace(opel);
        doRace(vw);
        doRace(toyota);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.increaseSpeed();
        System.out.println(car.getSpeed());
    }
}
