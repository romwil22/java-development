package javaProgram;

import java.util.Scanner;

public class JavaMathClass {

	public static void main(String[] args) {
		double number1 = 13.32564;
		double number2 = 45;
		double negativeNumber = -5;
		
		double maxNumber = Math.max(number1, number2);
		double minNumber = Math.min(number1, number2);
		double absNumber = Math.abs(negativeNumber);
		double sqrtNumber = Math.sqrt(number2);
		double roundNumber = Math.round(number1);
		double ceilNumber = Math.ceil(number1);
		double floorNumber = Math.floor(number1);
		
		System.out.println("Maximum number is " + maxNumber);
		System.out.println("Minimum number is " + minNumber);
		System.out.println("Absolute value is " + absNumber);
		System.out.println("Square root is " + sqrtNumber);
		System.out.println("Round off number is " + roundNumber);
		System.out.println("ceil number is " + ceilNumber);
		System.out.println("floor number is " + floorNumber);
		System.out.println();
		
		// finding hypotenuse
		// formula c = sqrt a^2 + b^2
		double a;
		double b;
		double c;
		
		Scanner userInput = new Scanner(System.in);
		
		// user entering value
		System.out.print("Enter a value: ");
		a = userInput.nextDouble();
		
		System.out.print("Enter b value: ");
		b = userInput.nextDouble();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.println("The hypothenuse is " + c);
		
		userInput.close();
	}

}
