package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class OverflowSample {

    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println(b); // 128
    }
}
