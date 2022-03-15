package com.phantic;

/**
 * Created by lazar on 3/15/2022.
 * Project name: memento
 **/
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}