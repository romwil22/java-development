package javaProgram;

import java.util.Scanner;

public class JaveForLoop {

	public static void main(String[] args) {
		
		// for loop increment ex.
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// for loop decrement ex.
		for (int i = 5; i >= 0; i--) {
			
			if (i != 0) {
				System.out.println(i);
			} 
			else {
				System.out.println("times up!");
			}
		}
		System.out.println();
		
		//nested for loop
		int rows;
		int columns;
		String symbol = "";
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter Number of rows: ");
		rows = userInput.nextInt();
		System.out.print("Enter Number of columns: ");
		columns = userInput.nextInt();
		System.out.print("Enter sysbol to print: ");
		symbol = userInput.next();
		
		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
			columns--;
		}
				
	}

}
