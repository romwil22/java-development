package com.firstprogram.stringmethods;

public class StringMethod {
    public static void main(String[] args) {
        // STRING METHODS
        String message = "Java String Methods";
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.indexOf("S"));
        System.out.println(message.isEmpty());
        System.out.println(message.replaceAll("Methods", "methods"));
        System.out.println(message.charAt(3));
    }
}
