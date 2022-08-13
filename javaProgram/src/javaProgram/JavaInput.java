package javaProgram;

import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		// name user input
		System.out.print("Your name>> ");
		String name = userInput.nextLine();
		System.out.println("welcome to java programming " + name);
		
		// age user input
		System.out.print("How old are you?>> ");
		int age = userInput.nextInt();
		userInput.nextLine();
		System.out.println("So your a " + age + " years old");
		
		//favorite color user input
		System.out.print("What is your favorite color?>> ");
		String favColor = userInput.nextLine();
		System.out.println(" your favorite color is " + favColor);
	}

}
