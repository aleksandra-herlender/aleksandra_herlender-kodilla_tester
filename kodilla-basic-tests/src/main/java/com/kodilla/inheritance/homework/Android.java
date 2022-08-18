package com.kodilla.inheritance.homework;

public class Android extends OperatingSystem {
    public Android(int year) {
        super(year);
    }

    @Override
    public void turnOff() {
        System.out.println("Android is stopping");
    }
}
