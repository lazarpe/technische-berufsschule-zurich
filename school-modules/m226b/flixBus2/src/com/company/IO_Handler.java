package com.company;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus2
 **/
public class IO_Handler {
    private final Scanner sc = new Scanner(System.in);
    private boolean validInput = true;
    private boolean stopProgram = false;
    TripManager tripManager = new TripManager();

    public void askUserToSelectAction() {
        do {
            try {
                System.out.println("\nSelect an action: ");
                printActionList();
                String selectedAction = sc.nextLine().toLowerCase();
                switch (selectedAction) {
                    case "a":
                        System.out.println("What is the departure date you are looking for? (format: YEAR-MONTH-DAY");
                        System.out.print("➔ ");
                        String specificDestination = sc.nextLine();
                        System.out.print("");
                        tripManager.findBusOnSpecificDepartureDate(LocalDate.parse(specificDestination));
                        validInput = true;
                        break;
                    case "b":
                        //TODO: Generate a new trip and validate that no other bus uses the same platform on this time
                        System.out.println("What's the destination of your trip?");
                        System.out.print("➔ ");
                        String destination = sc.nextLine();
                        System.out.println("When is the departure date? (format: YEAR-MONTH-DAY");
                        System.out.print("➔ ");
                        String departure = sc.nextLine();
                        System.out.println("When is the arrival date?");
                        System.out.print("➔ ");
                        String arrival = sc.nextLine();
                        System.out.println("What service is it? (international / national)");
                        System.out.print("➔ ");
                        String service = sc.nextLine();
                        System.out.print("");
                        switch (service) {
                            case "international":
                                tripManager.addTripToList(tripManager.generateTrip(destination, LocalDate.parse(departure), LocalDate.parse(arrival), Service.INTERNATIONAL));
                                break;
                            case "national":
                                tripManager.addTripToList(tripManager.generateTrip(destination, LocalDate.parse(departure), LocalDate.parse(arrival), Service.NATIONAL));
                                break;
                            default:
                                System.out.println("Something went wrong try again.");
                                break;
                        }

                        validInput = true;
                        System.out.println("Successfully added your trip:\n- Destination: " + destination + "\n- Departure: " + departure + "\n- Arrival: " + arrival + "\n- Service: " + service);
                        break;
                    case "c":
                        for (Trip trip : tripManager.getTripArrayList()) {
                            System.out.println("Destination: " + trip.getDestination());
                            System.out.println("Departure: " + trip.getDeparture());
                            System.out.println("Arrival: " + trip.getArrival());
                            System.out.println("Service: " + trip.getTripService());
                            System.out.println("---");
                        }
                        validInput = true;
                        break;
                    case "d":
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
        } while (validInput);
    }

    public void printActionList() {
        System.out.println("a) Check time when bus leaves platform");
        System.out.println("b) Generate a new trip");
        System.out.println("c) Show all trips");
        System.out.println("d) Quit");
        System.out.print("➔ ");
    }
}
