package com.company;

import java.time.LocalDate;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus2
 **/
public class Trip {
    private String destination;
    private LocalDate departure;
    private LocalDate arrival;
    private Service tripService;

    public Trip(String destination, LocalDate departure, LocalDate arrival, Service tripService) {
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.tripService = tripService;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public Service getTripService() {
        return tripService;
    }

    public void setTripService(Service tripService) {
        this.tripService = tripService;
    }
}
