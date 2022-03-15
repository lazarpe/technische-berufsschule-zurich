package com.phantic;

/**
 * Created by lazar on 3/8/2022.
 * Project name: m326
 **/
public class Director {
    public Plane makeBusinessPlane(Builder builder) {
        builder.setCockpit(Cockpit.FLY_BY_WIRE);
        builder.setEngine(4, AircraftType.JET);
        builder.setWings(Wings.LOW_BODY);
        builder.setFuselage(35, Aisle.DOUBLE_AISLE, 4);
        return new Plane(builder);
    }

    public Plane makePassengerJet(Builder builder) {
        builder.setCockpit(Cockpit.FLY_BY_WIRE);
        builder.setEngine(4, AircraftType.JET);
        builder.setWings(Wings.LOW_BODY);
        builder.setFuselage(35, Aisle.DOUBLE_AISLE, 4);
        return new Plane(builder);
    }
}
