package com.company;

import java.util.Scanner;

public class Part2Lesson2 {

    public static void main(String[] args){

        //2.4
        //Get from the user an int number (from console)
        //in case number > 100
        //Generate a random int in range 50 - number :
        //in case number < 100
        //Generate a random int in range 0 - 50:
        //cast the random number to String
        //print

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 50;

        System.out.println("Input number: ");
        int inputNum = scanner.nextInt();

        if(inputNum > 100){
            int generateRanNum = (int) (Math.random() * (max - inputNum + 1) + inputNum);
            System.out.println(generateRanNum);
        }
        if(inputNum < 100){
            int generateRanNum2 = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(generateRanNum2);
        }
    }
}
