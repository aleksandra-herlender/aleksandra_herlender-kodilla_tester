package com.kodilla.abstracts;

public class Duck extends Animals {

    public Duck() {
        super(2);
    }
    @Override
    public void giveVoice() {
        System.out.println("Quack");

    }
}
