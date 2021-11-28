package com.company;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus2
 **/
public class Platform {
    private int platformId;
    private int platformCapacity;
    private Service busService;

    public Platform(int platformId, int platformCapacity, Service busService) {
        this.platformId = platformId;
        this.platformCapacity = platformCapacity;
        this.busService = busService;
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public int getPlatformCapacity() {
        return platformCapacity;
    }

    public void setPlatformCapacity(int platformCapacity) {
        this.platformCapacity = platformCapacity;
    }

    public Service getBusService() {
        return busService;
    }

    public void setBusService(Service busService) {
        this.busService = busService;
    }
}
