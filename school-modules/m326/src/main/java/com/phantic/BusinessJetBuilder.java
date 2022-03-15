package com.phantic;

/**
 * Created by lazar on 3/8/2022.
 * Project name: m326
 **/
public class BusinessJetBuilder implements Builder {
    private Plane plane;

    public BusinessJetBuilder() {
        this.reset();
    }

    public void reset() {
        this.plane = new Plane();
    }

    @Override
    public void setFuselage(int amountOfSeats, Aisle aisle, int amountOfExits) {
        this.plane.setFuselage(new Fuselage(amountOfSeats, aisle, amountOfExits));
    }

    @Override
    public void setWings(Wings wingType) {
        this.plane.setWings(wingType);
    }

    @Override
    public void setCockpit(Cockpit cockpit) {
        this.plane.setCockpit(cockpit);
    }

    @Override
    public void setEngine(int amountOfCylinders, AircraftType aircraftType) {
        this.plane.setEngine(new Engine(amountOfCylinders, aircraftType));
    }

    @Override
    public Plane getResult() {
        return this.plane;
    }
}
