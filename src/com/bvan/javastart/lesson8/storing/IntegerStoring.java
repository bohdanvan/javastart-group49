package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class IntegerStoring {

    public static void main(String[] args) {
        int x = 10;
        int y = x;

        System.out.println("x == y: " + (x == y)); // true

        y++;

        System.out.println("x = " + x); // 10
        System.out.println("y = " + y); // 11

        System.out.println("x == y: " + (x == y)); // false
    }
}
