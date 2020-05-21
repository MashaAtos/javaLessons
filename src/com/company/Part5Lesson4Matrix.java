package com.company;

import java.util.Random;

public class Part5Lesson4Matrix {

    //4.6
    //Create matrix with dimensions 10x15
    //initialize with random ints in range 10 - 99
    //print it
    //Get the row number from console
    //Print the sum of the elements in that row of the matrix

    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        initializeMatrix(matrix);
        printMatrix(matrix);
        printSumOfRow(matrix);

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

    public static void printSumOfRow(int[][] sumOfRow){
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sum = sum + sumOfRow[i][j];
            }
            System.out.println("Sum of the " + i + " row" + " = " + sum);

            sum = 0;
        }
    }
}
