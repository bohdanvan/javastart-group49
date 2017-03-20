package com.bvan.javastart.lesson4.conditions;

/**
 * @author bvanchuhov
 */
public class WorkingWeekExtendedConditions {

    public static void main(String[] args) {
        int day = 1;

        boolean isWorkingDay = (day >= 2) && (day <= 5);
        boolean isFriendsDay = !isWorkingDay;
        boolean isJavaDay = (day == 2) || (day == 4);

        if (isWorkingDay) {
            System.out.println("Work");
        }
        if (isFriendsDay) {
            System.out.println("Friends");
        }
        if (isJavaDay) {
            System.out.println("Java Courses");
        }
    }
}
