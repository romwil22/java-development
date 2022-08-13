package javaProgram;

public class JavaMethods {

	public static void main(String[] args) {
		// creating methods void and return ex.
		
		// void example method
		message();
		
		//void with arguments
		String name = "Rom";
		String program = "Java";
		greeting(name, program);
		
		// return example method
		int number = 126;
		String result = oddEven(number);
		System.out.println(result);
		System.out.println();
		
		// overloaded methods ex.
		int product1 = multiple(2,6);
		System.out.println(product1);
		
		int product2 = multiple(4,7,9);
		System.out.println(product2);

	}
	
	static void message() {
		System.out.println("method Example program");
	}
	
	static void greeting(String name, String program) {
		System.out.println("welcome " + name + " to " + program + " programming");
	}
	
	static String oddEven(int number) {
		if ((number % 2) == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
	
	static int multiple(int number1, int number2) {
		System.out.println("multiple 2 times. overloaded method ex. 1");
		return number1 * number2;
	}
	
	static int multiple(int number1, int number2, int number3) {
		System.out.println("multiple 3 times. overloaded method ex. 2");
		return number1 * number2 * number3;
	}

}
