package com.company;

import java.util.Scanner;

public class Part5Lesson3 {

    public static void main(String[] args) {

        //3.12
        //Write a program to display the first n Fibonacci series.

        int num, first = 0,next = 1;

        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        System.out.print("Fibonacci numbers are " + num + " ");
        System.out.print(first + " " + next);
        for (int i = 1; i<=num-2; ++i)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
        }

        //3.13
        //Write a program to print a string  "ROBOTS_WILL_KILL_ALL_HUMANZ" in reverse order  (you can use myString.charAt(x) - google it)

        System.out.println("---------");

        String text = "ROBOTS_WILL_KILL_ALL_HUMANZ", reverse="";

        int length=text.length();
        for(int i = length - 1;i >= 0;i--)
            reverse = reverse + text.charAt(i);
        System.out.println(reverse);
    }
}
