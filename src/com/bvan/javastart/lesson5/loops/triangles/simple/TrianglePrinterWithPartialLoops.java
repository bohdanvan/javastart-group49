package com.bvan.javastart.lesson5.loops.triangles.simple;

/**
 * @author bvanchuhov
 */
public class TrianglePrinterWithPartialLoops {

    public static void main(String[] args) {
        int size = 3;

        // *, count = 1
        for (int n = 1; n <= 1; n++) {
            System.out.print("*");
        }
        System.out.println();

        // **, count = 2
        for (int n = 1; n <= 2; n++) {
            System.out.print("*");
        }
        System.out.println();

        // ***, count = 3
        for (int n = 1; n <= 3; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
