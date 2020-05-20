package com.company;

import java.util.Random;
import java.util.Scanner;

public class Part3Lesson4 {

    /*        4.4
        Create array with length 10
        Initialize with random ints (10 - 99)
        print it
        Get a number from console
        find and print the index  of that number*/

    public static void main(String[] args) {
        int[] array = initializeArray();
        print(array);
        int num = getNumberFromConsole();
        printIndexOfNumber(array, num);
    }

    public static int[] initializeArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(89) + 10;
        }
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int getNumberFromConsole() {
        System.out.print("Enter the number from list: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int findIndex(int[] array, int number) {
        if (array == null) return -1;
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == number) return i;
            else i = i + 1;
        }
        return -1;
    }

    public static void printIndexOfNumber(int[] array, int num){
        System.out.println("Index position of " + num + " is: " + findIndex(array, num));
    }
}
