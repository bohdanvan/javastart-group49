package com.bvan.javastart.lesson4.conditions;

/**
 * @author bvanchuhov
 */
public class WorkingWeekSimpleConditions {

    public static void main(String[] args) {
        int day = 6; // 1..7

        if (day <= 5) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
        }

        System.out.println("Java Courses");
    }
}
