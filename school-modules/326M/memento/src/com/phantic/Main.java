package com.phantic;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("MOOONKEY");
        originator.setState("DOOONKEY");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("CRUUUNCHY");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("HOOONKEY");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
