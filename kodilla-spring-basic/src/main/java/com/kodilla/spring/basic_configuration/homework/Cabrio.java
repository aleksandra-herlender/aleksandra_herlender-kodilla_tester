package com.kodilla.spring.basic_configuration.homework;

public class Cabrio implements Car{
    private boolean lightsOn;

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    @Override
    public boolean hasHeadLightTurnedOn() {
        return lightsOn;
    }

    @Override
    public String getCarType() {
        return "cabrio";
    }
}
