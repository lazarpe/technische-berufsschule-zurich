package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        Dog dog = new Dog("BigG", 3, 2);
        Dog dog1 = new Dog("BigGG", 3, 2);

        animalList.add(dog1);
        animalList.add(dog);
        for (Animal animal : animalList) {
            animal.printInfos();
        }
    }
}
