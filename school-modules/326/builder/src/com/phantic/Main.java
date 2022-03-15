package com.phantic;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        BusinessJetBuilder businessJetBuilder = new BusinessJetBuilder();
        director.makeBusinessPlane(businessJetBuilder);
        Plane plane = businessJetBuilder.getResult();
        System.out.println(plane.toString());
    }
}
