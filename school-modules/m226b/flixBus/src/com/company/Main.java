package com.company;

public class Main {

    public static void main(String[] args) {
        Travel travel = new Travel();
        Bus bus = travel.createBus();
        //System.out.println("BUS TYPE: " + bus.getBusType());
        travel.createTrip();
    }
}
