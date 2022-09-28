package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static String printSum(int value1, int value2) {
        return "Summe: " + (value1 + value2);
    }

    public static boolean check100(int value1) {
        return value1 > 100;
    }
}