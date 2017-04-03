package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class IntegerMethodStoring {

    public static void main(String[] args) {
        int x = 10;
        x = inc(x);
        System.out.println("x = " + x); // 11
    }

    private static int inc(int a) {
        return a + 1;
    }
}
