package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.Circle;
import com.kodilla.abstracts.homework.Rectangle;
import com.kodilla.abstracts.homework.Triangle;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();



        Circle circle = new Circle(5.5);
       System.out.println(circle.calculateArea());

        circle.calculatePerimeter();
        System.out.println(circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println(rectangle.calculatePerimeter());

        Triangle triangle = new Triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();
        System.out.println(triangle.calculatePerimeter());


    }
}
