package com.bvan.javastart.lesson5.loops;

/**
 * @author bvanchuhov
 */
public class EvensPrinter {

    public static void main(String[] args) {
        // from <= to
        int min = 11;
        int max = 20;

        if (min % 2 != 0) {
            min++;
        }
        for (int n = min; n <= max; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
