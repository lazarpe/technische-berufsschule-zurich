package com.company;

/**
 * Created by lazar on 11/16/2021.
 * Project name: flixBus
 **/
public class Bus extends Vehicle {
    private int busID = 0;
    private BusType busType;
    private boolean firstClass;

    public Bus(String fuel, int seats, int busID, BusType busType, boolean firstClass) {
        super(fuel, seats);
        this.busID = busID;
        this.busType = busType;
        this.firstClass = firstClass;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    public boolean isFirstClass() {
        return firstClass;
    }

    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }
}
