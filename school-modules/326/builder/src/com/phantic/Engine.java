package com.phantic;

/**
 * Created by lazar on 3/8/2022.
 * Project name: m326
 *
 */

public class Engine {
    private int amountOfCylinders;
    private AircraftType aircraftType;

    public Engine(int amountOfCylinders, AircraftType aircraftType) {
        this.amountOfCylinders = amountOfCylinders;
        this.aircraftType = aircraftType;
    }

    public int getAmountOfCylinders() {
        return amountOfCylinders;
    }

    public void setAmountOfCylinders(int amountOfCylinders) {
        this.amountOfCylinders = amountOfCylinders;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "amountOfCylinders=" + amountOfCylinders +
                ", aircraftType=" + aircraftType +
                '}';
    }
}
