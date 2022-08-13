package javaProgram;

import java.util.Random;

public class JavaRandonNumber {

	public static void main(String[] args) {
		Random random = new Random();
		
		int number = random.nextInt(); // generate random number -2B to 2B
		int number2 = random.nextInt(10)+1; // generate random number 1 to 10
		System.out.println("Random Number: " + number);
		System.out.println("Random Number 1 to 10: " + number2);
		
		double doubleNumber = random.nextDouble(); // generate random number 1.0 to 0.0
		System.out.println("Random double number: " + doubleNumber);
		
		boolean condition = random.nextBoolean();
		System.out.println("Random boolean value : " + condition);
	}

}
