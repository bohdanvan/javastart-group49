package com.bvan.javastart.lesson5.loops.triangles;

/**
 * @author bvanchuhov
 */
public class Triangle1 {

    public static void main(String[] args) {
        int size = 5;

        for (int x = size; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/