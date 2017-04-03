package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class StringMethodStoring {

    public static void main(String[] args) {
        String s = "Hello";
        char c = getLastChar(s);
        System.out.println(c);
    }

    private static char getLastChar(String s) {
        return s.charAt(s.length() - 1);
    }
}
