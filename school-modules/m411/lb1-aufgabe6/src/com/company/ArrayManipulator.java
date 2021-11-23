package com.company;

import java.util.Random;

/**
 * @author Lazar Petrovic
 */
public class ArrayManipulator {

    /** Removes elements which are divisible by divisor. Fills the "holes" at
     * the end of the array with zeroes.
     *
     * @return Number of removed elements
     */
    public static int removeNumbers(int [] array, int divisor) {
        int amountRemovedNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                amountRemovedNumbers++;
            }
        }
        return amountRemovedNumbers;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    /// DON'T CHANGE FROM HERE ON
    ///////////////////////////////////////////////////////////////////////////////////

    /** Prints out array for debugging purposes */
    private static void printArray(int[] array, String title) {
        if (title != null) {
            System.out.println(title);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]);
        }
        System.out.println();
    }

    /** Main method to initialize array and invoke removeElement() */
    public static void main(String [] args) {
        final int DIVISOR = 3;
        int [] array = new int[30];
        Random random = new Random(17); // 17 is the initialization seed
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;  // integer between 1 and 10 (inclusive)
        }
        printArray(array, "Nach Initialiserung");
        int removed = removeNumbers(array, DIVISOR);
        printArray(array, "Nach Entfernen von durch '" + DIVISOR + "' teilbaren Zahlen: Anzahl=" + removed);
        System.out.println();
        System.out.println("EXPECTED RESULT:");
        System.out.println( "Nach Entfernen von durch '" + DIVISOR + "' teilbaren Zahlen: Anzahl=9");
        System.out.println(" 7   1   5   7   4   5   4   1   2   8   4   4   8   8   8  10   1   8   1   5   1   0   0   0   0   0   0   0   0   0");
    }
}
