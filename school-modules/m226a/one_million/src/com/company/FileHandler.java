package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by lazar on 07.09.2021.
 * Project name: one_million
 **/
public class FileHandler {
    private static final String documentName = "document.txt";

    public static void createFile() {
        try {
            File file = new File(documentName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeNumbersToFile(int amountOfGeneratedNums) {
        try {
            FileWriter myWriter = new FileWriter(documentName);
            myWriter.write(String.valueOf(NumGenerator.generateRandomNums(1000000)).replace(
                    "[", "").replace(
                    "]", "").replace(
                    ",", "").replace(
                    " ", ""));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
