package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by lazar on 31.08.2021.
 * Project name: bufferedReader
 **/
public class FileManager {
    private String line = "";
    private String splitBy = ";";

    public FileManager() throws FileNotFoundException {
    }

    public void readFile(String filepath) {
        BufferedReader br = null;
        try {
            String inputLine;
            FileReader fr = new FileReader(filepath);
            br = new BufferedReader(fr);

            while ((inputLine = br.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readCSV(String filepath) {
        String splitBy = ";";
        try {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] persons = line.split(splitBy);    // use comma as separator
                System.out.println(
                        "Last Name = " + persons[0]
                                + ", First Name = "
                                + persons[1]
                                + ", Birthyear = "
                                + persons[2]
                                + " calculated age = " + Planner.getDiffYears(Integer.parseInt(persons[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printInformationBySpecificFirstName(String filepath, String specificFirstName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while ((line = br.readLine()) != null) {
                String[] persons = line.split(splitBy);
                if (persons[1].equals(specificFirstName)) {
                    System.out.println(
                            "Last Name = " + persons[0]
                                    + ", First Name = "
                                    + persons[1]
                                    + ", Birthyear = "
                                    + persons[2]
                                    + " calculated age = " + Planner.getDiffYears(Integer.parseInt(persons[2])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
