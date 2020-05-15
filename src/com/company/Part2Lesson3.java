package com.company;

public class Part2Lesson3 {

    public static void main(String[] args) {

        //3.6
        //Write a program to find the sum of odd numbers of the first 100 natural numbers.

        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        //3.7
        //Write a program to find the average of even numbers of the first 100 natural numbers.

        int sum1 = 0, count = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 + i;
                count++;
            }
        }

        int avg = sum / count;
        System.out.println(avg);
    }
}
