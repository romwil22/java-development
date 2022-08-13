package javaProgram;

public class javaVariable {

	public static void main(String[] args) {
		
		// variable and data types	
		int number = 26;
		double temperature = 36.4;
		boolean condition = true;
		char letter = 'r';
		String message = "welcome java developer";
		
		System.out.println("Integer value: " + number); // concatenate variable
		System.out.println("Float value: " + temperature);
		System.out.println("Boolean value: " + condition);
		System.out.println("Character value: " + letter);
		System.out.println("String value: " + message + "\n");
		
		// swap variable value
		String value1 = "python";
		String value2 = "java";
		String tempValue;
		
		System.out.println("value1: " +value1);
		System.out.println("value2: " +value2);
		
		// swapping value
		tempValue = value1;
		value1 = value2;
		value2 = tempValue;
		
		System.out.println("New value1: " +value1);
		System.out.println("New value2: " +value2);
		
	}

}
