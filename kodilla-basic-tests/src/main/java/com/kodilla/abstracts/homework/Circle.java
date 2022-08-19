package com.kodilla.abstracts.homework;

public  class Circle extends Shape {

    private double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return 3.141523 * r *r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*3.141523*r;
    }
}
