package com.functional.programming.fp.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incrementNumber = incrementByOne.apply(12);

        System.out.println(incrementNumber);

        int multiplyNumber = multiplyByTen.apply(11);

        System.out.println(multiplyNumber);

        int multiplyNumber2 = multiplyByTen.apply(incrementNumber);
        System.out.println(multiplyNumber2);

        //CHAINING FUNCTION
        System.out.println("CHAINING FUNCTION");

        Function<Integer, Integer> addByOneAndThenMultiplyByTen = incrementByOne.andThen(multiplyByTen);

        int numberResult = addByOneAndThenMultiplyByTen.apply(6);
        System.out.println(numberResult);

        //BIFUNCTION
        System.out.println("BIFUNCTION");
        System.out.println(incrementByOneAndMultiply.apply(12,11));
    }

    static Function<Integer, Integer> incrementByOne = number -> ++number;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply = (incrementNumber, multiplyNumber) -> (++incrementNumber) * multiplyNumber;
}
