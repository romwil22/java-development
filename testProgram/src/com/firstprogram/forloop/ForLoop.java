package com.firstprogram.forloop;

public class ForLoop {
    public static void main(String[] args) {
        // FOR LOOP

        int[] numberList = {2, 22, 3, 33, 1, 11};

        for (int i = 0; i < numberList.length; i++) {
            System.out.println(numberList[i]);
        }

        System.out.println();

        // FOR EACH
        String[] nameList = {"lil peep", "lil tracy", "horsehead", "coldhart"};

        for (String name : nameList) {
            System.out.println(name);
        }

        // intellij for short
        // - arrayName.for
        // - arrayName.fori
        // - arrayName.forr
    }
}
