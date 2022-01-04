package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        Weather weather = new Weather();
        weather.subscribe(person1);
        weather.subscribe(person2);
        
        weather.setWeather("sunny weather");        weather.setWeather("windy weather");


        weather.unsubscribe(person2);
    }
}
