package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySeqFiller {

    public static void main(String[] args) {
        int size = 40;

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));
    }
}
