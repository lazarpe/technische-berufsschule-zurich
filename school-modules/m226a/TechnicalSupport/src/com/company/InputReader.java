package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by lazar on 14.09.2021.
 * Project name: TechnicalSupport
 **/
public class InputReader {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<String> wordArrayList = new ArrayList<>();

    public ArrayList<String> askForProblem() {
        System.out.println("Describe your problem");
        System.out.print("> ");
        String problem = scanner.nextLine();
        Collections.addAll(wordArrayList, problem.split(" "));
        return wordArrayList;
    }

    public boolean askForOtherProblems() {
        while (true) {
            System.out.println("Any other problems? Y/N");
            System.out.print("> ");
            String answer = scanner.nextLine();

            if (answer.equals("Y") || answer.equals("y") || answer.equals("yes") || answer.equals("Yes") || answer.equals("YES") || answer.equals("YEs") || answer.equals("YeS")) {
                return true;
            } else if (!answer.equals("N") && !answer.equals("n") && !answer.equals("no") && !answer.equals("No") && !answer.equals("NO") && !answer.equals("nO")) {
                System.out.println("Invalid answer, try again");
            } else {
                return false;
            }
        }
    }
}
