package com.company.inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Dog dog1 = new Dog("Alaska", 100, "ABCDEFG123456");
        animals.add(dog1);

        int i = 1;


        for (Animal animal : animals) {
            System.out.println("Animal " + i);
            animal.printInfos();
            i++;
        }

        OverloadTest overloadTest = new OverloadTest();

        overloadTest.test("Hallloooo");
        overloadTest.test("Hallloooo", 1);

    }
}
