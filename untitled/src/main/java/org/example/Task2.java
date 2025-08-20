package org.example;

public class Task2 {
    public static void main(String[] args) {
        String name = "Ашот";
        System.out.println("Имя корректное? " + isNameValid(name));
    }

    public static boolean isNameValid(String name) {
        return name.length() <= 20;
    }
}
