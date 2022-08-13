package javaProgram;

import java.util.Scanner;

public class JavaLogicalOperators {

	public static void main(String[] args) {
		double grade;
		
		// using AND = &&
		grade = 75;
		
		if (grade >= 95 && grade <= 100) {
			System.out.println("Final grade: 1.0");
		}
		else if (grade >= 90 && grade <= 94) {
			System.out.println("Final grade: 1.5");
		}
		else if (grade >= 85 && grade <= 89) {
			System.out.println("Final grade: 2.0");
		}
		else if (grade >= 80 && grade <= 84) {
			System.out.println("Final grade: 2.5");
		}
		else if (grade >= 75 && grade <= 79) {
			System.out.println("Final grade: 3.0");
		}
		else {
			System.out.println("Failing Grade");
		}
		System.out.println();
		
		// using OR = ||
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Do you want to continue? (y/n): ");
		String userRespond = userInput.next();
		
		if (userRespond.equals("Y") || userRespond.equals("y")) {
			System.out.println("Welcome to Java Programming");
		} 
		else {
			System.out.println("Exit");
		}
		System.out.println();
		
		// usong NOT = !
		boolean value = false;
		
		if (!value) {
			System.out.println("Become true");
		} else {
			System.out.println("Become false");
		}
	}

}
