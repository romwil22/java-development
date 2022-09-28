package com.firstprogram.whileloop;

public class WhileLoop {
    public static void main(String[] args) {
        // WHILE LOOP
        int count = 0;

        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        System.out.println();

        // DO WHILE LOOP
        count = 0;

        do {
            System.out.println(count);
            count++;
        } while (count <= 5);
    }
}
