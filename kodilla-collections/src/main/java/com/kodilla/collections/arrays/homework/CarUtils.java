package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.VW;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("Car type: " + getCarType(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarType(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof VW)
            return "VW";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car name";
    }

}
