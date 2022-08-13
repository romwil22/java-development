package javaProgram;

public class JavaStringMethods {

	public static void main(String[] args) {
		String program = "Java";
		String program2 = "	Java	";
		
		boolean result = program.equals("Java");
		boolean result2 = program.equalsIgnoreCase("jAvA");
		int result3 = program.length();
		char result4 = program.charAt(2);
		boolean result5 = program.isEmpty();
		String result6 = program.toUpperCase();
		String result7 = program.toLowerCase();
		String result8 = program.trim();
		String result9 = program.replace('J', 'j');
		
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
	}

}
