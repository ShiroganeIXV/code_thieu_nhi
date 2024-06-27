package com.dwshop;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number, base and target base separated by space (e.g. 101 2 10) : ");
        String input = scanner.nextLine();

        // split input string by space
        String[] inputArray = input.split(" ");

        int number = Integer.parseInt(inputArray[0]);
        int base = Integer.parseInt(inputArray[1]);
        int target = Integer.parseInt(inputArray[2]);

        if (base != 10){
            // convert base to decimal
            long decimal = baseToDecimal(String.valueOf(number), base);
            // convert decimal to target base
            String result = decimalToBase(decimal, target);
            System.out.println(result);
        } else {
            // convert decimal to target base
            String result = decimalToBase(number, target);
            System.out.println(result);
        }

    }
    // convert string to integer
    public static int charToValue(char c) {
        if (c >= '0' && c <= '9')
            return c - '0';
        else if (c >= 'A' && c <= 'Z')
            return c - 'A' + 10;
        else if (c >= 'a' && c <= 'z')
            return c - 'a' + 10;
        return -1; // Invalid character for the base
    }

    // convert integer to string
    public static char valueToChar(int val) {
        if (val >= 0 && val <= 9)
            return (char) (val + '0');
        else if (val >= 10 && val <= 35)
            return (char) (val - 10 + 'A');
        return '?'; // Invalid value for the base
    }

    // convert any base to decimal
    public static long baseToDecimal(String num, int base) {
        long result = 0;
        int power = 0;

        for (int i = num.length() - 1; i >= 0; --i) {
            int val = charToValue(num.charAt(i));
            if (val >= base) {
                System.err.println("Invalid number for the base provided.");
                return -1;
            }
            result += val * Math.pow(base, power++);
        }
        return result;
    }

    // convert decimal to any base
    public static String decimalToBase(long num, int base) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.append(valueToChar((int) (num % base)));
            num /= base;
        }
        return result.reverse().toString();
    }
}
