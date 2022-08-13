package javaProgram;

public class JavaObjectsOOP {

	public static void main(String[] args) {
		// object OOP ex.
		
		Phone myPhone = new Phone(); // instance object
		System.out.println("Phone specification:");
		System.out.println("Model: " + myPhone.Model);
		System.out.println("Phone OS: " + myPhone.phoneOS);
		System.out.println("Internal storage: " + myPhone.storage + "gb");
		System.out.println("Memory: " + myPhone.memory + "gb");
		System.out.println("Prince: " + myPhone.price);
		System.out.println();
		
		myPhone.phoneOn();
		myPhone.phoneOff();
	}

}
