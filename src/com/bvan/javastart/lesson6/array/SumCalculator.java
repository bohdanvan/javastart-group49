package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class SumCalculator {

    public static void main(String[] args) {
        int[] array = {10, 30, 20, 25};

        int sum = 0;
        for (int elem : array) { // for-each, read only
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
