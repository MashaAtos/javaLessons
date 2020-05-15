package com.company;

public class Part1Lesson3 {

    public static void main(String[] args) {

        // 3.1 Write a program to display the first 20 natural numbers.

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }


        //3.2
        //Write a program to display the first 20 natural numbers but exclude the ones that are divisible by 3. (using continue)
        System.out.println("---------");

        for (int num = 1; num <= 20; num++) {
            if (num % 3 != 0) {
                continue;
            }
            System.out.println(num);
        }

        //3.3
        //Write a program to print the even numbers in range  {-20, +60}
        System.out.println("---------");

        for (int i = -20; i <= 60; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //3.4
        //Write a program to print the odd numbers in range  {-20,  -60}

        System.out.println("---------");

        for (int i = -20; i <= 60; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        //3.5
        //Write a program to find the sum of the first 100 natural numbers.
        System.out.println("---------");

        int sum = 0;

        for (int i = 0; i <= 100; i++) {

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
