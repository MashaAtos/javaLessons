package com.company;

import java.util.Scanner;

public class Part6Lesson2 {
    public static void main(String[] args) {

        //Given
        //you have a circle with radius 5:
        //
        //Display a menu in console
        //------------MENU-----------
        //---> enter 1 for calculating area of the circle
        //---> enter 2 for calculating perimeter of the circle
        //---> enter 3 for exit.

        Scanner scanner = new Scanner(System.in);
        int radius = 5;

        System.out.println("------------MENU-----------");
        System.out.println("enter 1 for calculating area of the circle");
        System.out.println("enter 2 for calculating perimeter of the circle");
        System.out.println("enter 3 for exit.");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                double area = Math.PI * (radius * radius);
                System.out.println("The area of circle is: " + area);
                break;
            case 2:
                double perimeter = 2 * Math.PI * radius;
                System.out.println("The perimeter of circle is: " + perimeter);
                break;
            case 3:
                System.exit(0);
        }
    }
}