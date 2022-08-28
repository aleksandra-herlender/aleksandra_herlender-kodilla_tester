package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.VW;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(15) + 1;
        Car[] cars = new Car[size];
        for (int i = 0; i < size; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }

    public static Car drawCar() {
        Random random = new Random();
        int speedNumber = random.nextInt(10) + 1;
        Car car = drawCarClass();
        for (int i = 0; i < speedNumber; i = i + 1) {
            car.increaseSpeed();
        }
        return car;
    }

    public static Car drawCarClass() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);     // possible values: 0, 1, 2;
        if (drawnCarKind == 0)
            return new Opel();
        else if (drawnCarKind == 1)
            return new VW();
        else {
            return new Toyota();
        }

    }
}
