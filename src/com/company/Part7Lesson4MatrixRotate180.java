package com.company;

import java.util.Random;

public class Part7Lesson4MatrixRotate180 {

    //4.8
    //Create matrix with dimensions 10x15
    //initialize with random ints in range 10 - 99
    //print it
    //Rotate it in 180* clockwise
    //Print the rotated matrix
    static int N = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        initializeMatrix(matrix);
        printMatrix(matrix);
        rotate180Clockwise(matrix);
        printRotatedMatrix(matrix);

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

    static void rotate180Clockwise(int arr[][]) {
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--);
        }
    }

    static void printRotatedMatrix(int arr[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
