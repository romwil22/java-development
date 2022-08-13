package javaProgram;

import java.util.ArrayList;

public class JavaForEach {

	public static void main(String[] args) {
		// for each ex.
		
		// array for each ex.
		String[] names = {"Ross", "Specter", "Person", "Zane"};
		
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		// arraylist for each ex.
		ArrayList<String> programs = new ArrayList<String>();
		programs.add("Python");
		programs.add("Java");
		programs.add("C#");
		programs.add("PHP");
		
		for (String language : programs) {
			System.out.println(language);
		}

	}

}
