package com.firstprogram.ifstatement;

public class IfStatement {
    public static void main(String[] args) {
        // IF STATEMENT
        int value1 = 23;
        int value2 = 35;

        if (value1 > value2) {
            System.out.println(value1 + " > " + value2);
        }

        // IF ELSE STATEMENT
        if (value2 < value1) {
            System.out.println(value2 + " < " + value1);
        }
        else {
            System.out.println(value2 + " is not less than " + value1);
        }

        // ELSE IF STATEMENT
        if (value1 >= value2) {
            System.out.println(value1 + " >= " + value2);
        } else if (value1 <= value2) {
            System.out.println(value1 + " <= " + value2);
        } else {
            System.out.println(value1 + " is equal to" + value2);
        }
    }
}
