package com.company;

/**
 * Created by lazar on 1/3/2022.
 * Project name: examPrep
 **/
public class Dog extends Animal {
    int bandNumber;

    public Dog(String name, int size, int bandNumber) {
        super(name, size);
        this.bandNumber = bandNumber;
    }

    @Override
    public void printInfos() {
        super.printInfos();
        System.out.println(bandNumber + " cool Bandnumber");
    }

    public int getBandNumber() {
        return bandNumber;
    }

    public void setBandNumber(int bandNumber) {
        this.bandNumber = bandNumber;
    }
}
