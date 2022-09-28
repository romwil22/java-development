package com.firstprogram.comparison;

public class ComparisonOperators {
    public static void main(String[] args) {
        // COMPARISON OPERATORS
        int value1 = 6;
        int value2 = 6;
        boolean condition1 =  value1 > value2; // greater than
        boolean condition2 =  value1 >= value2; // greater than or equal to
        boolean condition3 =  value2 < value1; // less than
        boolean condition4 =  value2 <= value1; // less than or equal to
        boolean condition5 =  value2 != value1; // not equal to
        boolean condition6 =  value2 == value1; // equal to

        System.out.println(condition1);
        System.out.println(condition2);
        System.out.println(condition3);
        System.out.println(condition4);
        System.out.println(condition5);
        System.out.println(condition6);
    }
}
