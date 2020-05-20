package com.company;

import java.util.Arrays;
import java.util.Random;

public class les4Practice {

    public static void main(String[] args) {

        printPerimeter(10, 11, 45);
        printPerimeter(20, 11);
        int[] array = initializeArray(10);
        printArrayElements(array);
        printArrayElements(initializeArray(10)); // or this


}
    public static void printPerimeter(int x, int y, int z){

        int printTriangle = x + y + z;
        System.out.println(printTriangle);
    }

    public static void printPerimeter(int x, int y){

        int printTriangle = 2 * (x + y);
        System.out.println(printTriangle);
    }

    public static int[] initializeArray(int length){
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30) + 30;

        }
        return array;
    }

    public static void printArrayElements(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
