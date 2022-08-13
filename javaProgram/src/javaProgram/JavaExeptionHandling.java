package javaProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExeptionHandling {

	public static void main(String[] args) {
		// exception handling ex.
		
		Scanner userInput = new Scanner(System.in);
		
		try {
			System.out.println("Enter number divide: ");
			int number1 = userInput.nextInt();
			System.out.println("Enter number2 divide by: ");
			int number2 = userInput.nextInt();
			
			double result = (double) number1 / (double) number2;
			System.out.printf("Result: %.1f", result);
			System.out.println();
			
		} catch (ArithmeticException e) {
			// handling arithmietic exception
			System.out.println("Zero is not divided, try again");
		} catch (InputMismatchException e) {
			// handling input mismatch exception
			System.out.println("You enter a string not a number, try again");
		} catch (Exception e) {
			// handling exception
			System.out.println("Invalid to divide");
		}
		finally {
			System.out.println();
			System.out.println("Thank you for using the program");
			userInput.close(); // good practice to close scanner
		}
		

	}

}
