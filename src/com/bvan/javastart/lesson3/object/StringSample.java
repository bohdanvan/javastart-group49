package com.bvan.javastart.lesson3.object;

/**
 * @author bvanchuhov
 */
public class StringSample {

    public static void main(String[] args) {
        String s = "Hello, Java!";

        int length = s.length();
        System.out.println("length = " + length); // 12

        char c = s.charAt(1);
        System.out.println("c = " + c); // e

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar); // !

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase); // HELLO, JAVA!

        String lowerCase = s.toLowerCase();
        System.out.println("lowerCase = " + lowerCase); // hello, java!

        boolean containsHello = s.contains("Hello");
        System.out.println("containsHello = " + containsHello); // true

        boolean equals = s.equals("Hello, Java");
        System.out.println("equals = " + equals); // false (no "!" at the end)

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("reversed = " + reversed); // !avaJ ,olleH
    }
}
