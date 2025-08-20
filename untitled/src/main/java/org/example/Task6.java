package org.example;

public class Task6 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        System.out.println(ticket.isLucky());
    }
}

class Ticket {
    private int value;

    public Ticket(int value) {
        this.value = value;
    }

    public boolean isLucky() {
        return true;
    }
}