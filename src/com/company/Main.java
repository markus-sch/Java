package com.company;

public class Main {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double h = 0;

        // h = Math.sqrt(a * a + b * b);
        // Die vorherige Formel kann man auch durch Math.pow ersetzen.
        h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Die Hypothenuse ist: " + h);

    }
}
