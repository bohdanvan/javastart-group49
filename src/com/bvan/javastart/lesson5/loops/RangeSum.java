package com.bvan.javastart.lesson5.loops;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        int min = 1;
        int max = 5;

        int sum = 0;
        for (int n = min; n <= max; n++) {
            sum += n;
        }

        System.out.println("sum = " + sum);
    }
}
