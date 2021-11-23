package com.company;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, String> airportList;
        Reader reader = new Reader("airports.csv");
        airportList = reader.readFile(",");
        //printMap(airportList);
        searchForAirport( airportList, "BDL");
    }

    public static void printMap(HashMap<String, String> hashMap) {
        System.out.println("Start");
        hashMap.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("End");
    }

    public static void searchForAirport(HashMap<String, String> hashMap, String airport) {
        System.out.println(hashMap.get(airport));
    }
}
