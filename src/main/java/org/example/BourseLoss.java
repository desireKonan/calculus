package org.example;

import java.util.Scanner;

public class BourseLoss {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxLoss = 0;
        int previousValue = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            if(result < 0)
                if(maxLoss >= result)
                    maxLoss += result;
            result = (v - previousValue);
            previousValue = v;
            System.err.println(v + " " + result + " " + maxLoss);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(maxLoss);
    }
}
