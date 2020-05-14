package com.company;

import java.util.Scanner;

public class Part3Lesson2 {
    public static void main(String[] args) {

        //2.5
        //Generate 2 random ints
        //Take from console an operator (+, -, * or /)
        //perform calculation based on operator
        //(USING SWITCH)
        //print the result

        Scanner scanner = new Scanner(System.in);

        int min = 10;
        int max = 100;

        double firstRandomNum = (Math.random() * (max - min + 1) + min);
        double secondNumdomNum = (Math.random() * (max - min + 1) + min);

        System.out.println("Input +, -, * or /: ");

        char operator = scanner.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = firstRandomNum + secondNumdomNum;
                break;

            case '-':
                result = firstRandomNum - secondNumdomNum;
                break;
            case '*':
                result = firstRandomNum * secondNumdomNum;
                break;
            case '/':
                result = firstRandomNum / secondNumdomNum;
                break;
            default:
                System.out.println("Operator is not correct");
                return;
        }

        System.out.println(firstRandomNum + " " + operator + " " + secondNumdomNum + "= " + result);
    }
}
