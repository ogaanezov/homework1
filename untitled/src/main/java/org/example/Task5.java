package org.example;

public class Task5 {
    public static void main(String[] args) {
        String email = "oganezov@mail.ru";
        System.out.println("Email валидный ? " + isEmailValid(email));
    }

    public static boolean isEmailValid(String email) {
        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');
        return at > 0 && dot > at;
    }
}
