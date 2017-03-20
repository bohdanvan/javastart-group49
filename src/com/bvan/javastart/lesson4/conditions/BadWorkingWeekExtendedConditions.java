package com.bvan.javastart.lesson4.conditions;

/**
 * @author bvanchuhov
 */
public class BadWorkingWeekExtendedConditions {

    public static void main(String[] args) {
        int day = 1;

        if (day <= 5) { // 1..5
            if (day >= 2) {
                System.out.println("Work");
            }
            if (day >= 4) {
                System.out.println("Friends");
            }
            System.out.println("Java Courses");
        } else { // 6..7
            System.out.println("Friends");
            if (day == 6) {
                System.out.println("Java Courses");
            }
        }
    }
}
