package com.firstprogram.arraylist;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        // ARRAYLIST

        ArrayList<String> characters = new ArrayList<String>();
        characters.add("hellboy");
        characters.add("ghostgorl");
        characters.add("xooos");

        for (String name : characters) {
            System.out.println(name);
        }
        System.out.println();

        characters.set(1, "GHOSTGORL");

        for (String name : characters) {
            System.out.println(name);
        }
        System.out.println();

        characters.remove(0);

        for (String name : characters) {
            System.out.println(name);
        }
        System.out.println();

        characters.clear();

        for (String name : characters) {
            System.out.println(name);
        }

        //2D ARRAYLIST
        ArrayList<ArrayList<Integer>> numberList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> hundreds = new ArrayList<Integer>();

        odd.add(1);
        odd.add(3);
        odd.add(5);

        even.add(2);
        even.add(8);
        even.add(12);

        hundreds.add(200);
        hundreds.add(400);
        hundreds.add(175);

        numberList.add(odd);
        numberList.add(even);
        numberList.add(hundreds);

        for (int i = 0; i < numberList.size(); i++) {
            System.out.println();
            for (int j = 0; j < numberList.get(i).size(); j++) {
                System.out.println(numberList.get(i).get(j));
            }
        }
    }
}
