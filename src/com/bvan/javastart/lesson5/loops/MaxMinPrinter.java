package com.bvan.javastart.lesson5.loops;

/**
 * @author bvanchuhov
 */
public class MaxMinPrinter {

    public static void main(String[] args) {
        int max = 100;
        int min = 10;

        // n = max..min
        for (int n = max; n >= min; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
