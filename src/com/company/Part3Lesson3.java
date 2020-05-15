package com.company;

import java.util.Scanner;

public class Part3Lesson3 {

    public static void main(String[] args) {

        //3.8
        //Write a program to read 10 numbers from keyboard (console) and find their sum and average


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 10 number: ");

        int sum = 0, num, avg;
        for (int i = 0; i < 10; i++) {
            num = scanner.nextInt();
            sum = sum + num;
        }

        avg = sum / 10;
        System.out.println("The sum of numbers is " + sum + " \nThe average of numbers is " + avg);

        //3.9
        //Write a program to display the cube of the number upto given integer.

        for (int i = 1; i < 6; i++) {
            System.out.println("The cube of " + i + " is " + (i * i * i));
        }
    }
}
