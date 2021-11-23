package com.company;

/**
 * Created by lazar on 21.09.2021.
 * Project name: binary-search
 **/
public class Stopwatch {
    private final long start;
    /**
     * Create a stopwatch object.
     */
    public Stopwatch() {
        start = System.currentTimeMillis();
    }


    /**
     * Return elapsed time (in seconds) since this object was created.
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

}
