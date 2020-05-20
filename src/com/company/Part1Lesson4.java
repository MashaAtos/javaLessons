package com.company;

import java.util.Random;
import java.util.Scanner;

public class Part1Lesson4 {

 /*   4.1
    Create array with length 10
    Initialize with random ints (10 - 99)
    print it
    get a number from consol
    test if an array contains that number*/


    public static void main(String[] args) {
        int[] array = initializeArray();
        print(array);
        int number = getNumberFromConsole();
        checkIfContains(array, number);
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
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int getNumberFromConsole() {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void checkIfContains(int[] array, int number) {
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("The array contains inputted number: " + number);
                return;
            }
        }
        System.out.println("Inputted number does not exist in array");
    }
}
