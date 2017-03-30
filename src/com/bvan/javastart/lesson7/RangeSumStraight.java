package com.bvan.javastart.lesson7;

/**
 * @author bvanchuhov
 */
public class RangeSumStraight {

    public static void main(String[] args) {
        System.out.println(straightRangeSum(10, 5)); // IllegalArgumentException
    }

    public static int straightRangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from > to");
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
