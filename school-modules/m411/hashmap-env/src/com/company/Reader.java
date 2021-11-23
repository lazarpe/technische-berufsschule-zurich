package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lazar on 28.09.2021.
 * Project name: hashmap-env
 **/
public class Reader {
    private Scanner sc;
    private final FileReader reader = new FileReader("airports.csv");

    public Reader(String csvPath) throws FileNotFoundException {
        this.sc = new Scanner(new File(csvPath));
    }

    public HashMap<String, String> readFile(String delimiter) {
        HashMap<String, String> data = new HashMap<>();
//        sc.useDelimiter(delimiter);
        sc.nextLine();
        try {
            while (sc.hasNextLine()) {
                String next = sc.nextLine();
                String[] split = next.split(delimiter);
                data.put(split[0], split[1]);
                //System.out.print(next + " ");
            }
        } catch (Exception ignored) {
        }
        return data;
    }

    public Reader() throws FileNotFoundException {
    }
}
