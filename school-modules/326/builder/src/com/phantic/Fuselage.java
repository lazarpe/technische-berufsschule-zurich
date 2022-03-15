package com.phantic;

/**
 * Created by lazar on 3/8/2022.
 * Project name: m326
 **/

public class Fuselage {
    private int amountOfSeats;
    private Aisle aisle;
    private int amountOfExists;

    public Fuselage() {
    }

    public Fuselage(int amountOfSeats, Aisle aisle, int amountOfExists) {
        this.amountOfSeats = amountOfSeats;
        this.aisle = aisle;
        this.amountOfExists = amountOfExists;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public Aisle getAisle() {
        return aisle;
    }

    public void setAisle(Aisle aisle) {
        this.aisle = aisle;
    }

    public int getAmountOfExists() {
        return amountOfExists;
    }

    public void setAmountOfExists(int amountOfExists) {
        this.amountOfExists = amountOfExists;
    }

    @Override
    public String toString() {
        return "Fuselage{" +
                "amountOfSeats=" + amountOfSeats +
                ", aisle=" + aisle +
                ", amountOfExists=" + amountOfExists +
                '}';
    }
}
