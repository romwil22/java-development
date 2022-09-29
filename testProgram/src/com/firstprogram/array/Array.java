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

        // 2D ARRAY
        String[][] topSixProgramming = new String[2][3];
        topSixProgramming[0][0] = "python";
        topSixProgramming[0][1] = "java";
        topSixProgramming[0][2] = "javascript";
        topSixProgramming[1][0] = "kotlin";
        topSixProgramming[1][1] = "R";
        topSixProgramming[1][2] = "php";

        for (int i = 0; i < topSixProgramming.length; i++) {
            System.out.println();
            for (int j = 0; j < topSixProgramming[i].length; j++) {
                System.out.print(topSixProgramming[i][j] + ", ");
            }
        }
        System.out.println();
        //ALTERNATE WAY
        String[][] topSixProgramming2 = {{"python","java","javascript"},
                                        {"kotlin","R","php"}};
        for (int i = 0; i < topSixProgramming2.length; i++) {
            System.out.println();
            for (int j = 0; j < topSixProgramming2[i].length; j++) {
                System.out.print(topSixProgramming2[i][j] + ", ");
            }
        }
    }
}
