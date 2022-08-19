package com.kodilla.inheritance.homework;

public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double area = calculator.circleArea(6);
        System.out.println(area);
    }
}
