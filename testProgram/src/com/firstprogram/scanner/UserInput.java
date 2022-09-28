package com.firstprogram.scanner;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = userInput.nextLine();
        System.out.println("Hi," + name + " Welcome to java programming");

        System.out.print("Enter your age: ");
        int age = userInput.nextInt();
        int yearBorn = LocalDate.now().minusYears(age).getYear();
        System.out.println("Your " + age + " years old, born in " + yearBorn);
    }
}
