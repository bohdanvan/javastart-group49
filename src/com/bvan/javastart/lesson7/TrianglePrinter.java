package com.bvan.javastart.lesson7;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        printTriangle(3);
        printTriangle(4);
        printTriangle(5);
        printTriangle(6);
    }

    private static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        for (int count = 1; count <= size; count++) {
            printRow(count);
        }
    }

    public static void printRow(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("negative count: " + count);
        }

        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
