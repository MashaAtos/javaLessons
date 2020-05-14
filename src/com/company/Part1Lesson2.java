package com.company;

public class Part1Lesson2 {

    public static void main(String[] args) {
        // 2.1
        //Generate 2 random int numbers in range 10 - 100
        //calculate the sum.
        //cast it to long.
        //print

        int min = 10;
        int max = 100;

        // Random numbers are generated for all tasks

        int firstRandomNum = (int) (Math.random() * (max - min + 1) + min);
        int secondNumdomNum = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(firstRandomNum);
        System.out.println(secondNumdomNum);

        int sum = firstRandomNum + secondNumdomNum;
        long longValueOfSum = (long) sum;
        System.out.println(longValueOfSum);

        // 2.2
        //Generate 2 random int numbers in range 10 - 100
        //calculate the product.

        int productOfRandomNums = firstRandomNum * secondNumdomNum;
        if (firstRandomNum % 2 == 0){
            long longValue = (long) productOfRandomNums;
            System.out.println(longValue);
        }
        else{
            double doubleValue = (double) productOfRandomNums;
            System.out.println(doubleValue);
        }

        // 2.3
        //Generate a random int number in range 10 - 100
        //calculate the square of it. (Math.pow())
        //cast the result to String,  (String.valueOf())
        //print the result

        int square = (int) Math.pow(firstRandomNum, secondNumdomNum);
        String numToString = String.valueOf(square);
        System.out.println(numToString);

    }

}

