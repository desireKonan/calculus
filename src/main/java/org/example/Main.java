package org.example;

public class Main {
    public static void main(String[] args) {
        int val1 = 18_000_000, val2 = 8_000;
        System.out.println("val1 | val2 = " + (val1 | val2));
        System.out.println("val1 & val2 = " + (val1 & val2) + "val1 / val2 =" + (val1 / val2));
        System.out.println("val1 ^ val2 = " + (val1 ^ val2));
        System.out.println("val1 >> 2 = " + (val1 >> 2));
        System.out.println("val1 >> 1 = " + (val1 >> 1));
        System.out.println("~val1 = " + (~val1));
        System.out.println("val1 << 2 = " + (val1 << 2));
        System.out.println("val1 << 1 = " + (val1 << 1));
    }
}