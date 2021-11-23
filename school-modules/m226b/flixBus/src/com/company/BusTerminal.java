package com.company;

import java.util.List;

/**
 * Created by lazar on 11/16/2021.
 * Project name: flixBus
 **/
public class BusTerminal {
    private List<Travel> allTrips;
    private Plattform platform;

    public BusTerminal(List<Travel> allTrips, Plattform platform) {
        this.allTrips = allTrips;
        this.platform = platform;
    }



    public List<Travel> getAllTrips() {
        return allTrips;
    }

    public void setAllTrips(List<Travel> allTrips) {
        this.allTrips = allTrips;
    }

    public Plattform getPlatform() {
        return platform;
    }

    public void setPlatform(Plattform platform) {
        this.platform = platform;
    }
}
