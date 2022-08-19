package com.kodilla.abstracts;

public abstract class Animals {
    private int numberOfLegs;

    public Animals(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public abstract void giveVoice();
}

