package com.company.inheritance;

public class Dog extends Animal {
    String bandNumber;

    public Dog(String name, int size, String bandNumber) {
        super(name, size);
        this.bandNumber = bandNumber;
    }

    @Override
    public void printInfos() {
        super.printInfos();
        System.out.println("nam33: " + name);
        System.out.println(bandNumber);
    }

    public String getBandNumber() {
        return bandNumber;
    }

    public void setBandNumber(String bandNumber) {
        this.bandNumber = bandNumber;
    }
}
