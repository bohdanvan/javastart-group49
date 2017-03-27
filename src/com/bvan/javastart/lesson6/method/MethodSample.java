package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class MethodSample {

    public static void main(String[] args) {
        int x = min(10, 20, 30);
        printX(x);
    }

    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static void printX(int x) {
        System.out.println("x = " + x);
    }
}
