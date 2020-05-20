package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Part2Lesson4 {

/*    4.2
    Create array with length 10
    Initialize with random ints (10 - 99)
    print it
    sort it in 'asc' order
    print the sorted*/

    public static void main(String[] args) {
        int[] array = initializeArray();
        print(array);
        sortNumbersAsc(array);
        sortNumbersDesc(array);
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

    public static void sortNumbersAsc(int[] array) {
        Arrays.sort(array);
        System.out.printf("Sorted in asc order: %s ", Arrays.toString(array));
    }

/*    4.3
    Create array with length 10
    Initialize with random ints (10 - 99)
    print it
    sort it in 'desc' order
    print the sorted*/

    public static void sortNumbersDesc(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
