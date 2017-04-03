package com.bvan.javastart.lesson8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayReverser {

    public static void main(String[] args) {
        testReverse();
    }

    private static void testReverse() {
        int[] array = {30, 20, 5, 10};
        reverse(array);

        int[] expected = {10, 5, 20, 30};
        System.out.println(Arrays.equals(array, expected));
    }

    private static void testSwap() {
        int[] array = {30, 20, 5, 10};
        swap(array, 0, 3);

        int[] expected = {10, 20, 5, 30};
        System.out.println(Arrays.equals(array, expected));
    }

    public static void reverse(int[] array) {
        for (int i = 0, j = array.length-1; i < j ; i++, j--) {
            swap(array, i, j);
        }
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j || array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
