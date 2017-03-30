package com.bvan.javastart.lesson7;

/**
 * @author bvanchuhov
 */
public class SumMethod {

    public static void main(String[] args) {
        System.out.println(sum(10, 20)); // 30
        System.out.println(sum(50, -40)); // 10
     }

    public static int sum(int a, int b) {
        return a + b;
    }
}
