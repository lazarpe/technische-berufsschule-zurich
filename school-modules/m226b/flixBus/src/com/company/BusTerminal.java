package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lazar on 11/16/2021.
 * Project name: flixBus
 **/
public class BusTerminal {
    private ArrayList<Travel> allTrips;
    private Plattform platform;
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object

    public BusTerminal(ArrayList<Travel> allTrips, Plattform platform) {
        this.allTrips = allTrips;
        this.platform = platform;
    }

    public void createTrip() {
        Travel trip = new Travel();
        System.out.println("Create a new trip...");
        System.out.print("Destination\n➔ ");
        trip.setDestination(scanner.nextLine());
        System.out.print("Departure time\n➔ ");
        trip.setDeparture_time(LocalTime.parse(scanner.nextLine()));
        // validate time:
        // if (getDeparture_time().toString().equals("23:44:22")) { }
        System.out.print("Arrival time\n➔ ");
        trip.setArival_time(LocalTime.parse(scanner.nextLine()));
        System.out.print("Leaving switzerland (y/n)\n➔ ");
        trip.setInternational(scanner.nextLine().equals("y"));
        System.out.print("Select a bus\n➔ ");
        //TODO: print list of available buses for that time
        allTrips.add(trip);
    }

    public void getBusInformation(int busId) {
        System.out.println("FINDING BUS..");
        for (int i = 0; i < allTrips.size(); i++) {
            if (i == busId) {
                System.out.println("Fuel type of BUS ID " + busId + allTrips.get(i).getTransportBus().getBusType());
            }
        }
    }

    public ArrayList<Travel> getAllTrips() {
        return allTrips;
    }

    public void setAllTrips(ArrayList<Travel> allTrips) {
        this.allTrips = allTrips;
    }

    public Plattform getPlatform() {
        return platform;
    }

    public void setPlatform(Plattform platform) {
        this.platform = platform;
    }
}
