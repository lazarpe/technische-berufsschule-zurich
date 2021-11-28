package com.company;

/**
 * Created by lazar on 11/16/2021.
 * Project name: flixBus
 **/
public class Plattform {
    private int platformID = 0;
    private Bus currentBus;

    public Plattform(int platformID, Bus currentBus) {
        this.platformID = platformID;
        this.currentBus = currentBus;
    }

    public int getPlatformID() {
        return platformID;
    }

    public void setPlatformID(int platformID) {
        this.platformID = platformID;
    }

    public Bus getCurrentBus() {
        return currentBus;
    }

    public void setCurrentBus(Bus currentBus) {
        this.currentBus = currentBus;
    }
}
