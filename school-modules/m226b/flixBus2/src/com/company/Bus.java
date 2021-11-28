package com.company;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus2
 **/
public class Bus extends Vehicle {
    private BusType busType;
    private boolean comfortClass; // true = 1st class, false = 2nd class

    public Bus(BusType busType, boolean comfortClass) {
        this.busType = busType;
        this.comfortClass = comfortClass;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    public boolean isComfortClass() {
        return comfortClass;
    }

    public void setComfortClass(boolean comfortClass) {
        this.comfortClass = comfortClass;
    }
}
