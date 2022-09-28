package com.firstprogram.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // ARRAY
        String[] names = new String[3];
        names[0] = "hellboy";
        names[1] = "gothboi";
        names[2] = "lil peep";

        System.out.println(Arrays.toString(names));

        // other way
        String[] names2 = {"hellboy", "gothboi", "lil peep"};

        System.out.println(Arrays.toString(names2));
        System.out.println("names length " + names.length);
        System.out.println("names2 length " + names2.length);

        // access index
        System.out.println(names[2]);
        System.out.println(names[0]);
        System.out.println(names[names.length - 1]);
    }
}
