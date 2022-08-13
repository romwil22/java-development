package ampackage2;
import ampackage1.*;
public class AccessAsub extends AccessA{
	// child class
	
	public static void main(String[] args) {
		// access modifier ex.
		AccessC noModifierC = new AccessC();
		AccessC publicC = new AccessC();
		AccessAsub protectedA = new AccessAsub();
		AccessB privateB = new AccessB();
		
		System.out.println(noModifierC.message); // access no modifier attribute
		System.out.println(publicC.publicMessage); // public access in AccessC attribute
		System.out.println(protectedA.protectedMessage); // access sub class
		// System.out.println(privateB.privateMessage); can't print cos only same class can access it
		
	}
}
