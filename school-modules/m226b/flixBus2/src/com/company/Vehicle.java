package com.company;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus2
 **/
public class Vehicle {
    private int passengerCapacity;

    public Vehicle(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
