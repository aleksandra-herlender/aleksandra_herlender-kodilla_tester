package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem{
    public Windows(int year) {
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Windows is starting");
    }
}
