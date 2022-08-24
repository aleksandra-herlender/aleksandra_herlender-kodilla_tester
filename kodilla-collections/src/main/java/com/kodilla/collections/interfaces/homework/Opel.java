package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int speed;

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 1;

    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 5;

    }
}
