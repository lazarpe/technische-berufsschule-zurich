package com.phantic;

/**
 * Created by lazar on 3/8/2022.
 * Project name: m326
 **/
public interface Builder {
    public void setFuselage(int amountOfSeats, Aisle aisle, int amountOfExits);
    public void setWings(Wings wingType);
    public void setCockpit(Cockpit cockpit);
    public void setEngine(int amountOfCylinders, AircraftType aircraftType);
    public Plane getResult();
}
