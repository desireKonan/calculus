package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BourseLossNew {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] vs = Arrays.asList(in.nextLine().split(" "))
                .stream()
                .mapToInt(Integer::parseInt).toArray();
        int maxLoose = 0;
        int value = vs[0];
        for (int i = 1; i < n; i++) {
            int currentLose = vs[i] - value;
            if(currentLose < 0){
                if(currentLose < maxLoose){
                    maxLoose = currentLose;
                }
            }else if (currentLose > 0){
                value = vs[i];
            }
        }

        System.out.println(maxLoose);
    }
}
