package com.bvan.javastart.lesson7;

/**
 * @author bvanchuhov
 */
public class HelloMessage {

    public static void main(String[] args) {
        System.out.println(helloMessage("John", 25));
        System.out.println(helloMessage("Bob", 20));
        System.out.println(helloMessage("Phil", 30));
    }

    public static String helloMessage(String name, int age) {
        return "Hello, I'm " + name + ", " + age + " years old";
    }
}
