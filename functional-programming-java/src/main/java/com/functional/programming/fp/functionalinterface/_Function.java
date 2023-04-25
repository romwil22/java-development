package com.functional.programming.fp.functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incrementNumber = incrementByOne.apply(0);

        System.out.println(incrementNumber);
    }

    static Function<Integer, Integer> incrementByOne = number -> ++number;
}
