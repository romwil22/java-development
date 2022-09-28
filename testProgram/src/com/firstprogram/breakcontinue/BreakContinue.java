package com.firstprogram.breakcontinue;

public class BreakContinue {
    public static void main(String[] args) {
        // BREAK & CONTINUE

        int[] numberList = {1, 2, 3, 4, 5};

        for (int number : numberList) {
            if (number == numberList[3]) {
                break;
            }
            System.out.println(number);
        }
        System.out.println();
        for (int number : numberList) {
            if (number == numberList[1]) {
                continue;
            }
            System.out.println(number);
        }
    }
}
