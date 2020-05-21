package com.company;

import java.util.Random;

public class Part4Lesson4Matrix {

    //4.5
    //Create matrix with dimensions 10x15
    //initialize with random ints in range 10 - 99
    //print it
    //find and print the maximum value

    public static void main(String[] args) {

        int[][] matrix = new int[10][15];
        initializeMatrix(matrix);
        printMatrix(matrix);
        printMaxValue(matrix);
    }

    public static void initializeMatrix(int[][] matrixToInit) {
        Random random = new Random();
        for (int i = 0; i < matrixToInit.length; i++) {
            for (int j = 0; j < matrixToInit[i].length; j++) {
                matrixToInit[i][j] = random.nextInt(89) + 10;
            }
        }
    }

    public static void printMatrix(int[][] matrixToPrint) {
        for (int i = 0; i < matrixToPrint.length; i++) {
            for (int j = 0; j < matrixToPrint[i].length; j++) {
                System.out.print(matrixToPrint[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getMaxValue(int[][] maxNumber) {
        int maxValue = maxNumber[0][0];
        for (int j = 0; j < maxNumber.length; j++) {
            for (int i = 0; i < maxNumber[j].length; i++) {
                if (maxNumber[j][i] > maxValue) {
                    maxValue = maxNumber[j][i];
                }
            }
        }
        return maxValue;
    }

    private static void printMaxValue(int[][] matrix) {
        System.out.println("The greatest number is : " + getMaxValue(matrix));
    }
}
