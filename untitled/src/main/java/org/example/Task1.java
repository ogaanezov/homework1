package org.example;

public class Task1 {
    public static void main(String[] args) {
        int number = 4;
        System.out.println("Чётное? " + isEven(number));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}