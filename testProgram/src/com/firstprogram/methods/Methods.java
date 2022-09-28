package com.firstprogram.methods;

public class Methods {
    public static void main(String[] args) {
        // METHODS

        message();
        int value1 = 20;
        int value2 = 22;
        int result = addition(value1,value2);
        System.out.println(result);
    }

    // VOID
    public static void message() {
        System.out.println("Welcome to java programming");
    }

    // RETURN (INT,DOUBLE,BOOLEAN,CHAR,STRING,ARRAY)
    public static int addition(int number1, int number2) {
        return number1 + number2;
    }
}
