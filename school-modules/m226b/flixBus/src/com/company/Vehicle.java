package com.company;

/**
 * Created by lazar on 11/23/2021.
 * Project name: flixBus
 **/
public class Vehicle {
    private String fuel;
    private int seats;

    public Vehicle(String fuel, int seats) {
        this.fuel = fuel;
        this.seats = seats;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
