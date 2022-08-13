package javaProgram;

public class JavaStaticKeyword {
	public static void main(String[] args) {
		// static method ex.
		
		ProgrammingLanguge language1 = new ProgrammingLanguge("java");
		ProgrammingLanguge language2 = new ProgrammingLanguge("python");
		ProgrammingLanguge language3 = new ProgrammingLanguge("c#");
		
		System.out.println(language1.program);
		System.out.println(language2.program);
		System.out.println(language3.program);
		System.out.println("Program count: "+ProgrammingLanguge.programCounter);
		
		ProgrammingLanguge.displayResult();
	}
}
