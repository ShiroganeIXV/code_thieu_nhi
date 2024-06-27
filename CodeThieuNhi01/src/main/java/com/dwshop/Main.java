package com.dwshop;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxLength = 0;

        System.out.printf("A + B = ?\n");
        System.out.printf("Nhập A:");
        String inputA = scanner.nextLine();

        System.out.printf("Nhập B:");
        String inputB = scanner.nextLine();

        if (inputA.length() > inputB.length()) {
            maxLength = inputA.length();
        } else {
            maxLength = inputB.length();
        }

        // clean input
        int[] a = cleanInput(inputA, maxLength);
        int[] b = cleanInput(inputB, maxLength);
        // sum a and b
        String result = sumBigInt(a, b);


        System.out.printf(result);


    }

    public static int[] cleanInput(String num, int maxLength){
        // reverse input string
        String reversed = new StringBuilder(num).reverse().toString();
        System.out.println(reversed);
        // split input string into int[]
        int[] result = new int[maxLength+1];
        for (int i = 0; i < reversed.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(reversed.charAt(i)));
        }
//        System.out.println(result.length);
        return result;
    }

    public static String sumBigInt(int[] a, int[] b) {
        for (int i = 0, j = 0; i < a.length && j < b.length; i++, j++) {
            if (a[i] + b[j] > 9) {
                a[i] = a[i] + b[j] - 10;
                a[i+ 1] = a[i + 1] + 1;
                System.out.println(a[i]);
                System.out.println(a[i+1]);
            } else {
                a[i] = a[i] + b[j];
            }
        }
        // reverse array
        int[] reversed = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - i - 1];
        }
        // convert array to string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversed.length; i++) {
            result.append(reversed[i]);
        }
        return result.toString();
    }



}