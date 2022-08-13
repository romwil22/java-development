package javaProgram;

public class JavaWhileLoop {
	
	public static void main(String[] args) {
		int count = 0;
		
		// while loop ex.
		while (count < 10) {
			count++;
			System.out.println(count);
		}
		System.out.println();
		
		count = 0;
		
		// do while loop ex.
		do {
			count++;
			System.out.println(count);
		} while (count < 5);
	}
}
