package com.company.abstraction;

public abstract class Animal {
    String name;
    int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public abstract void eat();

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
