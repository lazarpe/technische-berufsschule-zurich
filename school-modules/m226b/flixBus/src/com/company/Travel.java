package com.company;

import java.time.LocalTime;

/**
 * Created by lazar on 11/16/2021.
 * Project name: flixBus
 **/
public class Travel {
    private String destination;
    private LocalTime departure_time;
    private LocalTime arival_time;
    private boolean international;
    private Bus transportBus;

    public Travel(String destination, LocalTime departure_time, LocalTime arival_time, boolean international, Bus transportBus) {
        this.destination = destination;
        this.departure_time = departure_time;
        this.arival_time = arival_time;
        this.international = international;
        this.transportBus = transportBus;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(LocalTime departure_time) {
        this.departure_time = departure_time;
    }

    public LocalTime getArival_time() {
        return arival_time;
    }

    public void setArival_time(LocalTime arival_time) {
        this.arival_time = arival_time;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public Bus getTransportBus() {
        return transportBus;
    }

    public void setTransportBus(Bus transportBus) {
        this.transportBus = transportBus;
    }
}


