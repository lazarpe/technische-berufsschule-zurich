package com.company.abstraction;

import com.company.inheritance.Animal;

public class Pig extends Animal {
    int number;

    public Pig(String name, int size, int number) {
        super(name, size);
        this.number = number;
    }

    public void eat() {
        System.out.println("He's eating!!! Mampf");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
