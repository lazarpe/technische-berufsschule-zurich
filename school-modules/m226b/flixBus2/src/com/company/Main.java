package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, select an action: ");
        printActionList();
    }

    public static void printActionList() {
        System.out.println("a) Check time when bus leaves platform");
        System.out.println("b) Generate a new trip");
        System.out.println("c) Show all trips");
    }
}
