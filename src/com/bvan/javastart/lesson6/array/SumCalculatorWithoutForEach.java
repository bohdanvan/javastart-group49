package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SumCalculatorWithoutForEach {

    public static void main(String[] args) {
        int[] array = {10, 30, 20, 25};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
