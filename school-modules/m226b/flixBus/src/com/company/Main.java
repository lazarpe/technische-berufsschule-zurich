package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Travel travel = new Travel();
        ArrayList<Travel> travelList = new ArrayList<>();
        IO_Handler io_handler = new IO_Handler();

        BusTerminal busTerminal = new BusTerminal(travelList, new Plattform(1, new Bus("fuel", 4, 1, BusType.SINGLE, false)));
        // Create hardcoded 10x a bus
        for (int i = 0; i < 10; i++) {
            travel.createBus(i);
        }
        //System.out.println("BUS TYPE: " + bus.getBusType());

        if (io_handler.askWhoUserIs().equals("u")) {
            if (io_handler.printUserMenu().equals("a")) {
                // TODO: FIND A BUS BY IT'S ID
                busTerminal.getBusInformation(1);
            } else if (io_handler.printUserMenu().equals("b")) {
                // TODO: FIND A TRIP
            }
        } else if (io_handler.askWhoUserIs().equals("w")) {
            if (io_handler.printWorkerMenu().equals("a")) {
                // TODO: ADD A BUS
            } else if (io_handler.printWorkerMenu().equals("b")) {
                // TODO: ADD A TRIP
            }
        }

        busTerminal.createTrip();
    }
}
