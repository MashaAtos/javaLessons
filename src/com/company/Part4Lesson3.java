package com.company;

import java.util.Scanner;

public class Part4Lesson3 {

    public static void main(String[] args) {

        // 3.9
        // Write a program to display the cube of the number upto given integer.


        for (int i = 1; i < 6; i++) {
            System.out.println("The cube of " + i + " is " + (i * i * i));
        }

        // 3.10
        // Write a program to display the multiplication table of a given integer

        int num;

        System.out.println("Input the number: ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        // 3.11
        // Write a program to determine whether a given number is prime or not.

        int number;
        int remainder;
        boolean isPrime = true;

        System.out.println("Enter the number : ");
        number = scanner.nextInt();

        for (int i = 2; i < number / 2; i++) {
            remainder = number % i;

            if (remainder == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + "is a prime number");
        } else {
            System.out.println(number + "is not a prime number");
        }
    }
}
