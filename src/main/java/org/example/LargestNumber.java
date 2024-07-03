package org.example;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int D = in.nextInt();
        int count = 0;
        String digits = "";
        System.err.println(number + ", D = " + D);

        while(number % D != 0 && count < 3) {
            digits = Integer.toString(number);
            int number1 = Integer.parseInt(digits.substring(0, digits.length() - 1 - count));
            int number2 = Integer.parseInt(digits.substring(count, digits.length()));
            number = (number1 % D == 0) ? number1 : number2;
            count++;
        }

        number = (number % D) == 0 ? number : 0;

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(number);
    }
}
