package com.bvan.javastart.lesson5.loops.triangles.simple;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 5;

        // Print Triangle
        for (int count = 1; count <= size; count++) {
            // Print Row
            for (int n = 1; n <= count; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
