package com.bvan.javastart.lesson3.scanner_hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoIO {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        scanner.close(); // не обязательно

        // BL
        String message = "Hello, I'm " + name + ", " + age + " years old";

        // Output
        System.out.println(message);
    }
}
