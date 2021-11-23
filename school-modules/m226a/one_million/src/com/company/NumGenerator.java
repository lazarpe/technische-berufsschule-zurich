package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lazar on 07.09.2021.
 * Project name: one_million
 **/
public class NumGenerator {
    private static final Random rand = new Random();
    private static ArrayList<String> listOfRandomNums = new ArrayList<String>();

    public static ArrayList<String> generateRandomNums(int amountNumsToGenerate) {
        for (int i = 0; i < amountNumsToGenerate; i++) {
            listOfRandomNums.add(String.valueOf(rand.nextInt(1000)) + "\n");
        }
        return listOfRandomNums;
    }
}
