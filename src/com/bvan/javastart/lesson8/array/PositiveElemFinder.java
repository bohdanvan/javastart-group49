package com.bvan.javastart.lesson8.array;

/**
 * @author bvanchuhov
 */
public class PositiveElemFinder {

    public static void main(String[] args) {
        testArrayWithPositiveElems();
        testArrayWithoutPositiveElems();
    }

    private static void testArrayWithoutPositiveElems() {
        System.out.println("Array without positive elems: ");

        int[] array = {-1, -2};

        System.out.println(
                findFirstPositiveElem(array) == Integer.MIN_VALUE
        );
        System.out.println(
                findLastPositiveElem(array) == Integer.MIN_VALUE
        );
        System.out.println(
                findFirstPositiveElemIndex(array) == -1
        );
        System.out.println(
                findLastPositiveElemIndex(array) == -1
        );
        System.out.println();
    }

    private static void testArrayWithPositiveElems() {
        System.out.println("Array with positive elems: ");

        int[] array = {-5, 20, 10, -50, 30, -20};

        System.out.println(
                findFirstPositiveElem(array) == 20
        );
        System.out.println(
                findLastPositiveElem(array) == 30
        );
        System.out.println(
                findFirstPositiveElemIndex(array) == 1
        );
        System.out.println(
                findLastPositiveElemIndex(array) == 4
        );
        System.out.println();
    }

    public static int findFirstPositiveElem(int[] array) {
        for (int elem : array) {
            if (elem > 0) {
                return elem;
            }
        }

        return Integer.MIN_VALUE;
    }

    public static int findLastPositiveElem(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                return array[i];
            }
        }

        return Integer.MIN_VALUE;
    }

    public static int findFirstPositiveElemIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return i;
            }
        }

        return -1;
    }

    public static int findLastPositiveElemIndex(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                return i;
            }
        }

        return -1;
    }
}
