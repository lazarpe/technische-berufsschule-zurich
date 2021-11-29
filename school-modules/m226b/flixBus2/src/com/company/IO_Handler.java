package com.company;

import java.util.Scanner;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus2
 **/
public class IO_Handler {
    private final Scanner sc = new Scanner(System.in);
    private boolean validInput = false;

    public void askUserToSelectAction() {
        do {
            try {
                System.out.println("Select an action: ");
                printActionList();
                String selectedAction = sc.nextLine().toLowerCase();

                if (selectedAction.equals("a")) {
                    //TODO: check time when bus leaves platform
                    validInput = true;
                } else if (selectedAction.equals("b")) {
                    //TODO: Generate a new trip and validate that no other bus uses the same platform on this time
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
        } while (!validInput);
    }

    public void printActionList() {
        System.out.println("a) Check time when bus leaves platform");
        System.out.println("b) Generate a new trip");
        System.out.println("c) Show all trips");
        System.out.print("➔ ");
    }
}
