package com.company;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.lang.Math;
import java.util.*;

public class Main {

    static void reverse(int[] myArray) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magicNum = 10;
        int[] fakeArr = new int[magicNum];
        for (int i = 1; i <= magicNum; i++) {
            System.out.print(i + ". num > ");
            fakeArr[i - 1] = sc.nextInt();
        }
        System.out.print("cool\n");
        reverse(fakeArr);
        /*function reverses the elements of the array*/

        /*
        // ex 3.1
        int[] c = new int[100];
        for (int i = 1; i <= 100; i++) {
            c[i-1] = (int)(Math.random()*(100-1+1)+1);
        }

        int min = c[0];
        int max = c[1];
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
            if (c[i] < min) {
                min = c[i];
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
      */
        /*
        int[] a = new int[10];
        System.out.println("a");
        for (int i = 0; i < 9; i++) {
            if (i != 5) {
                a[i] = i;
                System.out.println(a[i]);
            } else {
                a[i] = 100;
                System.out.println(a[i]);
            }
        }
        System.out.println("b\n");
        int[] b = a;
        for (int i = 0; i < 9; i++) {
            if (i != 5) {
                b[i] = i;
                System.out.println(b[i]);
            } else {
                b[i] = 100;
                System.out.println(b[i]);
            }
        }*/
    }
}