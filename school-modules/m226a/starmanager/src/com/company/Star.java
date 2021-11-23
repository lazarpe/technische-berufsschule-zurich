package com.company;

/**
 * Created by lazar on 31.08.2021.
 * Project name: starmanager
 **/
public class Star {
    private String FirstName;
    private String SecondName;
    private String LastFilm;

    public Star(String firstName, String secondName, String lastFilm) {
        FirstName = firstName;
        SecondName = secondName;
        LastFilm = lastFilm;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getLastFilm() {
        return LastFilm;
    }

    public void setLastFilm(String lastFilm) {
        LastFilm = lastFilm;
    }
}
