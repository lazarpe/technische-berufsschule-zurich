package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lazar on 12/26/2021.
 * Project name: ObserverPattern
 **/
public class Weather {
    private String currentWeather;
    private List<Person> people = new ArrayList<>();

    /**
     * Add a person to list
     * @param person
     */
    public void subscribe(Person person) {
        people.add(person);
    }

    /**
     * Remove a person from list
     * @param person
     */
    public void unsubscribe(Person person) {
        people.remove(person);
    }

    /**
     * Set current weather for all people from list
     * @param weather
     */
    public void setWeather(String weather) {
        currentWeather = weather;

        for (Person person : people) {
            person.update(currentWeather);
        }
    }
}
