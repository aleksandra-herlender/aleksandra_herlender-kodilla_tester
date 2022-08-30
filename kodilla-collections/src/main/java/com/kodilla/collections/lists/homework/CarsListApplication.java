package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.VW;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Toyota());
        cars.add(new Opel());
        VW vw = new VW();
        cars.add(vw);


        for (Car car:cars
             ) {
            CarUtils.describeCar(car);
        }

        cars.remove(1);
        cars.remove(vw);

        for (Car car:cars
        ) {
            CarUtils.describeCar(car);
        }
        System.out.println(cars.size());

    }
}
