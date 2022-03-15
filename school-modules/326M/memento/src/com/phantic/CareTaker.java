package com.phantic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lazar on 3/15/2022.
 * Project name: memento
 **/
public class CareTaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
