package com.company;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 4, 2, 88, 55, 77, 78, 54, 3};
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted:");
        printArray(arr);
        Stopwatch stopwatch2 = new Stopwatch();
        binarySearch(arr, 0, arr.length-1, 3);
        System.out.println(stopwatch2.elapsedTime());
    }

    public static void binarySearch(int[] arr, int first, int last, int searchedNum) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < searchedNum) {
                first = mid + 1;
            } else if (arr[mid] == searchedNum) {
                System.out.println("Element (" + searchedNum + ") found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element (" + searchedNum + ") not found!");
        }
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
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
