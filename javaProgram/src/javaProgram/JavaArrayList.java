package javaProgram;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		// array list ex.
		// ArrayList<> use of reference data types
		
		ArrayList<String> langauge = new ArrayList<String>();
		
		// add value in the array list
		langauge.add("java");
		langauge.add("python");
		langauge.add("php");
		langauge.add("c++");
		System.out.println(langauge);
		System.out.println();
		
		for (int i = 0; i < langauge.size(); i++) {
			System.out.println(langauge.get(i));
		}
		System.out.println();
		
		// changing value in array list
		langauge.set(2, "julia");
		for (int i = 0; i < langauge.size(); i++) {
			System.out.println(langauge.get(i));
		}
		System.out.println();
		
		// removing value in array list
		
		langauge.remove(3);
		langauge.set(2, "julia");
		for (int i = 0; i < langauge.size(); i++) {
			System.out.println(langauge.get(i));
		}
		System.out.println();
		
		// delete all value in array list
		langauge.clear();
		
		if (langauge.isEmpty()) {
			System.out.println("language ArrayList is empty");
		}
	}

}
