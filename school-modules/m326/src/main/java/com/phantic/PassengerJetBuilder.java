package com.phantic;

/**
 * Created by lazar on 3/8/2022.
 * Project name: m326
 **/
public class PassengerJetBuilder implements Builder {

    @Override
    public void setFuselage(int amountOfSeats, Aisle aisle, int amountOfExits) {

    }

    @Override
    public void setWings(Wings wingType) {

    }

    @Override
    public void setCockpit(Cockpit cockpit) {

    }

    @Override
    public void setEngine(int amountOfCylinders, AircraftType aircraftType) {

    }

    @Override
    public Plane getResult() {
        return null;
    }
}
