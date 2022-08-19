package com.kodilla.abstracts;

public class AnimalProcessor {

    public void process(Animals animals) {
        System.out.println("Animal has" + animals.getNumberOfLegs() + "legs");
        animals.giveVoice();
    }
}
