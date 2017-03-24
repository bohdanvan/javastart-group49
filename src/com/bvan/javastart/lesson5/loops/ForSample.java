package com.bvan.javastart.lesson5.loops;

/**
 * @author bvanchuhov
 */
public class ForSample {

    public static void main(String[] args) {
        // n = 1..10
        for (int n = 1; n <= 10; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 10..1
        for (int n = 10; n >= 1; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 1..10, evens
        // BAD
        for (int n = 1; n <= 10; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // GOOD
        for (int n = 2; n <= 10; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
