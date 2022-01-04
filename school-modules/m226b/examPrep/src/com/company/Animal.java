package com.company;

/**
 * Created by lazar on 1/3/2022.
 * Project name: examPrep
 **/
public class Animal {
    String name;
    int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void printInfos() {
        System.out.println(name + " " + size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
