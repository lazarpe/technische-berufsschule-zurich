package com.company;

import java.time.ZoneId;
import java.util.Date;

/**
 * Created by lazar on 31.08.2021.
 * Project name: bufferedReader
 **/
public class Planner {

    public static int getDiffYears(int birthYear) {
        int today = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear();
        return today - birthYear;
    }
}
