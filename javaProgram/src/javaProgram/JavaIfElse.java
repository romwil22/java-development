package javaProgram;

public class JavaIfElse {

	public static void main(String[] args) {
		int age;
		int grade;
		
		
		// checking for legal age of player
		age = 19;
		if (age>=21) {
			System.out.println("Your legal to play in casino");
		}
		else {
			System.out.println("Your Under Age");
		}
		System.out.println();
		// final grading of person
		
		grade = 94;
		
		if (grade >= 90) {
			System.out.println("your final grade A");
		}
		else if (grade >= 80) {
			System.out.println("your final grade B");
		}
		else if (grade >= 75) {
			System.out.println("your final grade C");
		}
		else if (grade >= 70) {
			System.out.println("your final grade D");
		}
		else {
			System.out.println("Failing grade");
		}

	}

}
