package com.practice.oop.practico01;

import java.time.Year;

public class LeapYearApp {

    public static void main(String[] args) {

        int currentYear = Year.now().getValue();
        System.out.println("Next 10 leap years:");

        printNextLeapYears(currentYear + 1);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void printNextLeapYears(int startYear) {
        int count = 0;
        int year = startYear;

        while (count < 10) {
            if (isLeapYear(year)) {
                printYear(year);
                count++;
            }
            year++;
        }
    }

    public static void printYear(int year) {
        System.out.println(year);
    }
}
