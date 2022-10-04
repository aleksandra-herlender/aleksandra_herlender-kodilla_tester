package com.kodilla.spring.basic_configuration;

public class Dog implements Animal {

    @Override
    public String getVoice() {
        return "Bark bark";
    }
}
