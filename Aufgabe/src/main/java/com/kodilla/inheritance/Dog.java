package com.kodilla.inheritance;

public class Dog extends Animal {

    public Dog() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau, hau");

    }
}
