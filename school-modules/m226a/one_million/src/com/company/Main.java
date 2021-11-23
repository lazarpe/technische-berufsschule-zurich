package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileHandler.createFile();
        FileHandler.writeNumbersToFile(1000000);
    }
}
