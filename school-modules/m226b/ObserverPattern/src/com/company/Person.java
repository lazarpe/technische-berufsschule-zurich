package com.company;

/**
 * Created by lazar on 12/26/2021.
 * Project name: ObserverPattern
 **/
public class Person implements WeatherListener {

    @Override
    public void update(String weather) {
        System.out.println("I like " + weather);
    }
}
