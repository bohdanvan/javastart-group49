package com.bvan.javastart.lesson3.type.double_type;

/**
 * @author bvanchuhov
 */
public class DoubleStrangeSum {

    public static void main(String[] args) {
        System.out.println(0.1 + 0.2); // 0.30000000000000004
        System.out.println(0.3 - 0.1); // 0.19999999999999998

        System.out.println(0.1 + 0.1); // 0.2

        double d = 0.3 - 0.1;
        String s = String.format("%.3f", d);
        System.out.println(s); // 0,200
    }
}
