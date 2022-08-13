package javaProgram;

import java.util.Random;

public class JavaArrays {

	public static void main(String[] args) {
		// array of programming language
		String[] programming = {"python", "java", "javascript", "php"};
		
		for (int i = 0; i < programming.length; i++) {
			System.out.println(programming[i]);
		}
		System.out.println();
		
		// another way to create an array
		int[] numbers = new int[5];
		Random random = new Random();
		
		// generate random numbers
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(5)+1;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 2d array integer ex. 
		int[][] numbers2D = {
								{1,2,3,4},
								{5,6,7,8},
								{9,10,11,12}
							};
		
		for (int i = 0; i < numbers2D.length; i++) {
			System.out.println();
			
			for (int j = 0; j < numbers2D[i].length; j++) {
				System.out.print(numbers2D[i][j] + ", ");
			}
		}
	}

}
