package com.phantic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by lazar on 3/8/2022.
 * Project name: m326
 **/

public class Plane {
    private Fuselage fuselage;
    private Wings wings;
    private Cockpit cockpit;
    private Engine engine;

    public Plane(Builder builder) {
        this.fuselage = builder.getResult().getFuselage();
        this.wings = builder.getResult().getWings();
        this.cockpit = builder.getResult().getCockpit();
        this.engine = builder.getResult().getEngine();
    }

    public Plane() {
    }

    public Fuselage getFuselage() {
        return fuselage;
    }

    public void setFuselage(Fuselage fuselage) {
        this.fuselage = fuselage;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
