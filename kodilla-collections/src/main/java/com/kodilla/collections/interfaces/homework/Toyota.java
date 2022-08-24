package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {

    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 10;

    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 5;

    }
}
