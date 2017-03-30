package com.bvan.javastart.lesson7;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        System.out.println(rangeSum(10, 12)); // 33
        System.out.println(rangeSum(5, 5)); // 5
        System.out.println(rangeSum(30, 29)); // 59
    }

    public static int rangeSum(int from, int to) {
        if (to < from) {
            int temp = from;
            from = to;
            to = temp;
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
