package javaPolymorphism;

public class JavaPolymorphism {

	public static void main(String[] args) {
		// polymorphism ex.
		
		Helicopter helicopter = new Helicopter();
		Airplane airplane = new Airplane();
		Jet jet = new Jet();
		
		// array of objects
		Airship[] airship = {helicopter,airplane,jet};
		
		//access the array of objects
		for (Airship i : airship) {
			i.departure();
		}

	}

}
