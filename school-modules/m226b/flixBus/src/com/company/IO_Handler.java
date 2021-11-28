package com.company;

import java.util.Scanner;

/**
 * Created by lazar on 11/28/2021.
 * Project name: flixBus
 **/
public class IO_Handler {
    Scanner sc = new Scanner(System.in);
    boolean validInput = false;
    String selectedAction = "";

    public String askWhoUserIs() {
        String user = "";
        try {
            do {
                System.out.println("Hey, are you a user (u) or a worker (w)?");
                user = sc.nextLine().toLowerCase();
                if (user.equals("u")) {
                    validInput = true;
                    System.out.println("Welcome user!");
                    return "u";
                } else if (user.equals("w")) {
                    validInput = true;
                    System.out.println("Hi team mate!");
                    return "w";
                }
            } while (!validInput);
        } catch (Exception e) {
            System.out.println("Input not valid, try again.");
        }
        return "";
    }

    public String printUserMenu() {
        try {
            System.out.println("Select an action:");
            System.out.println("a) Find a bus");
            System.out.println("b) Find a trip");
            System.out.print("➔ ");
            selectedAction = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
        return selectedAction;
    }

    public String printWorkerMenu() {
        try {
            System.out.println("Select an action:");
            System.out.println("a) Add a bus");
            System.out.println("b) Add a trip");
            System.out.print("➔ ");
            selectedAction = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
        return selectedAction;
    }
}
