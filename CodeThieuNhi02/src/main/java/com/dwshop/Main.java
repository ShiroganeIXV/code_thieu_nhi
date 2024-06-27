package com.dwshop;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // array with items are array of integers
    private static final int[][] items = {
            // binary, octal, hexadecimal
            {0, 0, 0},
            {1, 1, 1},
            {10, 2, 2},
            {11, 3, 3},
            {100, 4, 4},
            {101, 5, 5},
            {110, 6, 6},
            {111, 7, 7},
            {1000, 10, 8},
            {1001, 11, 9},
            {1010, 12, 10},
            {1011, 13, 11},
            {1100, 14, 12},
            {1101, 15, 13},
            {1110, 16, 14},
            {1111, 17, 15},
            {10000, 20, 16},
            {10001, 21, 17},
            {10010, 22, 18},
            {10011, 23, 19},
            {10100, 24, 20},
            {10101, 25, 21},
            {10110, 26, 22},
            {10111, 27, 23},
            {11000, 30, 24},
            {11001, 31, 25},
            {11010, 32, 26},
            {11011, 33, 27},
            {11100, 34, 28},
            {11101, 35, 29},
            {11110, 36, 30},
            {11111, 37, 31},
            {100000, 40, 32},
            {100001, 41, 33},
            {100010, 42, 34},
            {100011, 43, 35},
            {100100, 44, 36},
            {100101, 45, 37},
            {100110, 46, 38},
            {100111, 47, 39},
            {101000, 50, 40},
            {101001, 51, 41},
            {101010, 52, 42},
            {101011, 53, 43},
            {101100, 54, 44},
            {101101, 55, 45},
            {101110, 56, 46},
            {101111, 57, 47}
    };


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // split input string by space
        String[] inputArray = input.split(" ");

        int number = Integer.parseInt(inputArray[0]);
        int base = Integer.parseInt(inputArray[1]);
        int target = Integer.parseInt(inputArray[2]);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("items[0][0] = %d\n", items[0][0]);

    }
}