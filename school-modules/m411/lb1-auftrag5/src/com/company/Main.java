package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Aufgabe 5 - Mit Stack arbeiten - in Java");
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Geben sie etwas ein: ");
        char[] arr = scanner.next().toLowerCase().toCharArray();

        for (char c : arr) {
            stack.push(c);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.pop());
        }
    }
}
