package org.example;

public class Task4 {
    public static void main(String[] args) {
        String str = "Formula";
        System.out.println("Начинается с большой буквы? " + startsWithUppercase(str));
    }

    public static boolean startsWithUppercase(String str) {
        return !str.isEmpty() && Character.isUpperCase(str.charAt(0));
    }
}
