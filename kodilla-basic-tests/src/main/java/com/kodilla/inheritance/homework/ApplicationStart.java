package com.kodilla.inheritance.homework;

public class   ApplicationStart {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1900);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.turnOff();

        Android android = new Android(1990);
        android.turnOn();
        android.turnOff();



    }
}
