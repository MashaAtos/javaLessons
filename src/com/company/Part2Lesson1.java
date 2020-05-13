package com.company;

import java.util.Scanner;

public class Part2Lesson1 {
    public static void main(String[] args) {

        // 1.4 Write a Java program that takes two numbers as input from console and display the product of two numbers.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        int inputNumber1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int inputNumber2 = scanner.nextInt();

        System.out.println(inputNumber1 + " x " + inputNumber2 + " = " + inputNumber1 * inputNumber2);


        // 1.5 Write a Java program that takes a number as input and prints its multiplication table upto 10.

        System.out.println("Input a number: ");
        int number1 = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(number1 + " x " + (i + 1) + " = " + (number1 * (i + 1)));
        }

        // 1.6  print the area and perimeter of a circle.

        double radius = 7.5;

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        // 1.7 Write a Java program to convert temperature from Fahrenheit to Celsius degree.

        System.out.println("Input a degree in Fahrenheit:");

        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit - 32) * 5 / 9);

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        // 1.8 Write a Java program that reads a number in inches, converts it to meters.

        System.out.println("Input a value for inch: ");

        double inch = scanner.nextDouble();
        double meters = inch * 0.0254;

        System.out.println(inch + " inch is " + meters + " meters");

        // 1.9 Write a Java program to get a number from the user and print whether it is positive or negative.

        System.out.print("Input a number: ");

        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // 1.10 Take three numbers from the user and print the greatest number.

        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input the 3rd number: ");
        int num3 = scanner.nextInt();

        if ((num1 > num2) && (num1 > num3))
            System.out.println("The greatest: " + num1);

        if ((num2 > num1) && (num2 > num3))
            System.out.println("The greatest: " + num2);

        if ((num3 > num1) && (num3 > num2))
            System.out.println("The greatest: " + num3);

        // 1.11  Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

        System.out.println("Input the 5 numbers : ");

        int num5, sum = 0;

        for (int i = 0; i < 5; i++) {
            num5 = scanner.nextInt();
            sum = sum + num5;
        }

        int average = sum / 5;
        System.out.println("The sum of 5 no is : " + sum + "\nThe Average is : " + average);

        // 1.12   Write a program Check Whether Number is Even or Odd

        System.out.println("Input: ");
        int num6 = scanner.nextInt();

        System.out.println("Input: ");
        int num7 = scanner.nextInt();

        if (num6 % 2 == 0) {
            System.out.println("Even");
        }
        if (num7 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
