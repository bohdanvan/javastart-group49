package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class MaxFinder {

    public static void main(String[] args) {
        int[] array = {10, 30, 20};

        if (array.length == 0) {
            System.out.println("Sorry, the array is empty");
            System.exit(0);
        }

        int max = array[0];
        for (int elem : array) {
            if (max < elem) {
                max = elem;
            }
        }

        System.out.println("max = " + max);
    }
}
