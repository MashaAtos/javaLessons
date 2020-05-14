package com.company;

import java.util.Scanner;

public class Part4Lesson2 {
    public static void main(String[] args) {

        // 2.6 Write a program to input week number(1-7) from console and print day of week name  (1 - monday …7 - sunday) using switch case.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number from 1-7: ");
        int dayNumber = scanner.nextInt();
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day range";
        }
        System.out.println(dayName);
    }
}
