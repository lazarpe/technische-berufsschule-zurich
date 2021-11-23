package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<Customer, String> hashMap = new HashMap<>();
    public static void main(String[] args) {
        try {
            readFromCSVFile("customer.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        searchForACustomer();
    }

    public static void readFromCSVFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        scanner.nextLine(); // skip header line
        System.out.println("print complete list of customers");
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String lastname = parts[0];
            String firstname = parts[1];
            int yearOfBirth = Integer.parseInt(parts[2]);
            String pw = parts[3];

            // print complete list of customers
            System.out.println(lastname + "|" + firstname + "|" + yearOfBirth + "|" + pw);

            // Adding customers to hashmap
            Customer customer = new Customer(lastname, firstname, yearOfBirth, pw);
            hashMap.put(customer, pw);
        }
        scanner.close();
    }

    public static void searchForACustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter lastname: ");
        String lastname = scanner.nextLine();

        System.out.println("enter firstname: ");
        String firstname = scanner.nextLine();

        System.out.print("enter birthYear: ");
        int birthYear = scanner.nextInt();

        Customer searchedCustomer = new Customer(lastname, firstname, birthYear);
        System.out.println(searchedCustomer.getLastname());
        System.out.println(searchedCustomer.getFirstname());
        System.out.println(searchedCustomer.getYearOfBirth());
        if (hashMap.get(searchedCustomer) != null) {
            System.out.println("PW=" + hashMap.get(searchedCustomer));
        } else {
            System.out.println("PW=" + searchedCustomer.getPw());
        }
    }
}

class Customer {
    String lastname;
    String firstname;
    int yearOfBirth;
    String pw;

    public Customer(String lastname, String firstname, int yearOfBirth) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.yearOfBirth = yearOfBirth;
    }

    // empty constructor
    public Customer() {
    }

    //constructor with all fields
    public Customer(String lastname, String firstname, int yearOfBirth, String pw) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.yearOfBirth = yearOfBirth;
        this.pw = pw;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
