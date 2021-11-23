package com.company;

public class Main {

    public static void main(String[] args) {
	    int num = 3331;
	    boolean istPrimzahl = true;

	    for (int i = 2; i < num / 2 + 1; i++) {
	        if (num % i == 0) {
	            istPrimzahl = false;
	            break;
            }
        }
	    if (istPrimzahl) {
            System.out.println(num + " ist eine Primzahl");
	    } else {
            System.out.println(num + " ist keine Primzahl");
        }
    }
}
