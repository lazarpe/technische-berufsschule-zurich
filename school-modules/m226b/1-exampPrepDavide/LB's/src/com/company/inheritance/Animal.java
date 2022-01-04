package com.company.inheritance;

public class Animal {
    public String name;
    public int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void printInfos() {
        System.out.println(name + "\n" + size);
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