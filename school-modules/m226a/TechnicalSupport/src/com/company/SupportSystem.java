package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by lazar on 14.09.2021.
 * Project name: TechnicalSupport
 **/
public class SupportSystem {
    private final HashMap<String, String> supportList = new HashMap<>();

    public void greetClient() {
        System.out.println("                                                         \n" +
                " _______ _______ _______ _______ _______ _______ _______ \n" +
                "|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\n" +
                "| +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "| |   | | |   | | |   | | |   | | |   | | |   | | |   | |\n" +
                "| |S  | | |u  | | |p  | | |p  | | |o  | | |r  | | |t  | |\n" +
                "| +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|\n" +
                "                                                         ");
        System.out.println("Hello, we are here to help you!");
    }

    public void fillSupportList() {
        this.supportList.put("slow", "I think it has to do with the hardware.");
        this.supportList.put("bug", "Nobody is perfect. There are bugs in every program. Taking a break can help!");
        this.supportList.put("girlfriend", "Trust me bro, she will forget about it or she maybe doesnt even care about it! Just buy her some flowers <3");
        this.supportList.put("grade", "A grade is just a number.");
    }

    public String findSolution(@NotNull ArrayList<String> problemKey) {
        String solution = null;
        for (String word : problemKey) {
            if (supportList.containsKey(word)) {
                solution = supportList.get(word);
            }
        }
        return Objects.requireNonNullElse(solution, "Sorry man, cant help you out. Ask your baba.");
    }
}