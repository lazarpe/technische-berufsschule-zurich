package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by lazar on 31.08.2021.
 * Project name: starmanager
 **/
public class StarManager {
    private int starId = 1;
    private ArrayList<Star> starList = new ArrayList<>();
    private Scanner myScanner = new Scanner(System.in);

    public void addStarToList(Star star) {
        starList.add(star);
    }

    public void printStars() {
        ArrayList<Star> starListDuplicate = starList;
        starListDuplicate.sort(Comparator.comparing(Star::getSecondName));
        for (Star star : starListDuplicate) {
            System.out.println("######");
            System.out.println("First name: " + star.getFirstName());
            System.out.println("Last name: " + star.getSecondName());
            System.out.println("Last film: " + star.getLastFilm());
            starId++;
        }
    }

    public void removeStarFromList() {
        System.out.println("Which star do you want to remove: ");
        while (true) {
            try {
                starId = Integer.parseInt(myScanner.nextLine());
                starList.remove(starId - 1);
                System.out.println(starId + " got removed");
                break;

            } catch (Exception e) {
                System.out.println("Enter a valid id for the star");
            }
        }
    }
}
