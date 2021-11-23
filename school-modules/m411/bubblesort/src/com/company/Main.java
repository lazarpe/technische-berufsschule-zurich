package com.company;

import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {5, 2, 8, 54, 23, 11, 10, 13333, 5, 3};
        System.out.println("Unsorted");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted");
        printArray(arr);
    }
    public static void bubbleSort(int @NotNull [] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int x = 0; x < n-i-1; x++) {
                if (arr[x] > arr[x+1]) {
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
