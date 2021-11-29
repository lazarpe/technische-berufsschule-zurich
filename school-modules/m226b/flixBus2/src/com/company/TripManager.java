package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by lazar on 11/29/2021.
 * Project name: flixBus2
 **/
public class TripManager {
    private ArrayList<Trip> tripArrayList = new ArrayList<>();;

    public Bus generateBus(int passengerCapacity, BusType busType, boolean comfortClass) {
        return new Bus(passengerCapacity, busType, comfortClass);
    }

    public Trip generateTrip(String destination, LocalDate departure, LocalDate arrival, Service service) {
        return new Trip(destination, departure, arrival, service);
    }

    public void addTripToList(Trip trip) {
        tripArrayList.add(trip);
    }

    public ArrayList<Trip> getTripArrayList() {
        return tripArrayList;
    }
}
