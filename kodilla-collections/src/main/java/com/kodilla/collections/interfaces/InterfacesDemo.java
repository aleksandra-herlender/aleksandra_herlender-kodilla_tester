package com.kodilla.collections.interfaces;

import java.util.concurrent.Callable;

public class InterfacesDemo {
    public static void main(String[] args) {

    Square square = new Square(10.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        showShapeDetails(square);

     Circle cirlce = new Circle(7.0);
        System.out.println(cirlce.getArea());
        System.out.println(cirlce.getPerimeter());
        showShapeDetails(cirlce);

        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        showShapeDetails(triangle);

            }

    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
        }



