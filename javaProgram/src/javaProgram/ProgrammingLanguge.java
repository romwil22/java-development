package javaProgram;

public class ProgrammingLanguge {
	String  program;
	static int programCounter = 0; // access this static int attribute
	
	ProgrammingLanguge(String  program){
		this.program = program;
		programCounter++;
	}
	
	// access this static method
	static void displayResult() {
		System.out.println("Number of programming language " + programCounter); 
	}
}
