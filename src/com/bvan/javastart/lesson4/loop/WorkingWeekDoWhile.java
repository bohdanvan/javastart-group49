package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekDoWhile {

    public static void main(String[] args) {
        int day = 6;

        do {
            System.out.println(day + ": Work");
            day++;
        } while (day <= 5);
    }
}
