package com.bvan.javastart.lesson8.matrix;

/**
 * @author bvanchuhov
 */
public class MatrixSample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    private static void printArray(int[] row) {
        if (row == null) {
            System.out.println("null");
            return;
        }

        for (int elem : row) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
