package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         StarManager startManager = new StarManager();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("How many stars you want to add: ");

        int amountStars = 0;
        while (true) {
            try {
                amountStars = Integer.parseInt(myScanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter valid number!");
                myScanner.nextLine();
            }
        }

        for (int i = 1; i <= amountStars; i++) {
            System.out.println("First Name of Star " + i + ": ");
            String firstName = myScanner.nextLine();

            System.out.println("Last Name of star " + i + ": ");
            String lastName = myScanner.nextLine();

            System.out.println("Last Film of star " + i + ": ");
            String lastFilm = myScanner.nextLine();

            startManager.addStarToList(new Star(firstName, lastName, lastFilm)); // are parameters going to be overwritten by the setters?
        }
        startManager.printStars();

        startManager.removeStarFromList();
        startManager.printStars();
    }
}