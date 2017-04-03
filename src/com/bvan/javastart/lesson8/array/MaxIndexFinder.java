package com.bvan.javastart.lesson8.array;

/**
 * @author bvanchuhov
 */
public class MaxIndexFinder {

    public static void main(String[] args) {
        System.out.println(
                findIndexOfMax(new int[]{2, 5, -1}) == 1
        ); // 1
        System.out.println(
                findIndexOfMax(new int[]{5, 5, -1}) == 0
        ); // 0
        System.out.println(
                findIndexOfMax(new int[]{100, -100, 1000, 0}) == 2
        );
        System.out.println(
                findIndexOfMax(new int[]{0, 0, 0}) == 0
        );
        System.out.println(
                findIndexOfMax(new int[]{})
        );
    }

    public static int findIndexOfMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("the array is empty");
        }

        int indexOfMax = 0;
        int max = array[indexOfMax];

        for (int i = 1; i < array.length; i++) {
            int elem = array[i];
            if (elem > max) {
                max = elem;
                indexOfMax = i;
            }
        }

        return indexOfMax;
    }
}
