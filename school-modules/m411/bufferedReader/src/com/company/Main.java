package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fm = null;
        String firstName = null;
        try {
            fm = new FileManager();
            System.out.println("Enter the persons first name: ");
            firstName = scanner.nextLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fm != null;
        //fm.readFile("hoi.txt");
        fm.printInformationBySpecificFirstName("csv.txt", firstName);
        //fm.readCSV("csv.txt");
    }
}

