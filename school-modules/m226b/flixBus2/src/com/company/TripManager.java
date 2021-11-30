package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by lazar on 11/29/2021.
 * Project name: flixBus2
 **/
public class TripManager {
    private ArrayList<Trip> tripArrayList = new ArrayList<>();
    private ArrayList<Bus> busArrayList = new ArrayList<>();

    public TripManager() {
        addBusToList(generateBus(30, BusType.DOUBLE, false));
        addBusToList(generateBus(45, BusType.DOUBLE, true));
        addBusToList(generateBus(100, BusType.SINGLE, false));
        addBusToList(generateBus(15, BusType.SINGLE, false));

        addTripToList(generateTrip("Madrid", LocalDate.of(2022, 1, 10), LocalDate.of(2022, 1, 11), Service.INTERNATIONAL));
        addTripToList(generateTrip("Serbia", LocalDate.of(2022, 1, 20), LocalDate.of(2022, 1, 21), Service.INTERNATIONAL));
        addTripToList(generateTrip("Bern", LocalDate.of(2022, 3, 3), LocalDate.of(2022, 3, 3), Service.NATIONAL));
    }

    public Bus generateBus(int passengerCapacity, BusType busType, boolean comfortClass) {
        return new Bus(passengerCapacity, busType, comfortClass);
    }

    public void addBusToList(Bus bus) {
        this.busArrayList.add(bus);
    }

    public Trip generateTrip(String destination, LocalDate departure, LocalDate arrival, Service service) {
        return new Trip(destination, departure, arrival, service);
    }

    public void addTripToList(Trip trip) {
        tripArrayList.add(trip);
    }

    public void findBusOnSpecificDepartureDate(LocalDate departure) {
        for (Trip trip : getTripArrayList()) {
            if (trip.getDeparture().isEqual(departure)) {
                System.out.println("TRIPS WITH DEPARTURE DATE: " + departure);
                System.out.println("Destination: " + trip.getDestination());
                System.out.println("Departure: " + trip.getDeparture());
                System.out.println("Arrival: " + trip.getArrival());
                System.out.println("Service: " + trip.getTripService());
                System.out.println("---");
            }
        }
        if (getTripArrayList().size() == 0) {
            System.out.println("No bus is found with departure date " + departure);
        }
    }

    /**
     * Matches Bus with a trip if bus type is DOUBLE and trip service is INTERNATIONAL
     */
    public Bus findMatchingBusForTrip(ArrayList<Bus> busArrayList, Trip trip) {
        for (Bus bus : busArrayList) {
            if (bus.getBusType() == BusType.DOUBLE && trip.getTripService() == Service.INTERNATIONAL) {
                return bus;
            } else if (bus.getBusType() == BusType.SINGLE && trip.getTripService() == Service.NATIONAL) {
                return bus;
            }
        }
        // if no more matching buses are available we are getting a big one. We assume that
        // this is really rarely the case. If this happens people with first class ticket will get refund
        return new Bus(50, BusType.DOUBLE, false);
    }

    /**
     * Find matching platform by matching the capacity of people from the bus and the platform
     */
    public Platform findMatchingPlatform(ArrayList<Platform> platformArrayList, Bus bus, int platformID) {
        for (Platform platform : platformArrayList) {
            if (platform.getPlatformCapacity() >= bus.getPassengerCapacity()) {
                return platform;
            }
        }
        // in case that there is no available platform, the busterminal got a special platform
        // only for emergencies or when no more are left.
        return new Platform(platformID, 100, Service.INTERNATIONAL);
    }

    public ArrayList<Bus> getBusArrayList() {
        return busArrayList;
    }

    public ArrayList<Trip> getTripArrayList() {
        return tripArrayList;
    }
}
