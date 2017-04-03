package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class NullStoring {

    public static void main(String[] args) {
        String s = null;
        int length = s.length(); // NullPointerException
        System.out.println(length);
    }
}
