package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SupportSystem supportSystem = new SupportSystem();
        InputReader inputReader = new InputReader();

        supportSystem.greetClient();
        supportSystem.fillSupportList();

        do {
            ArrayList<String> problem = inputReader.askForProblem();
            System.out.println(supportSystem.findSolution(problem));
        } while (inputReader.askForOtherProblems());
    }
}
