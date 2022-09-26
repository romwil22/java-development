package com.firstprogram.concatenate;

public class Concatenate {
    public static void main(String[] args) {
        // STRING CONCATENATE
        String name = "rom";
        String message = "welcome to java programming";

        String print = name + ", " + message;
        String alternateConcatenate = name.concat(", ").concat(message);

        System.out.println(print);
        System.out.println(alternateConcatenate);
    }
}
