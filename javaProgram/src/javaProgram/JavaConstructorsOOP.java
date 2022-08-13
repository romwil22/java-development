package javaProgram;

public class JavaConstructorsOOP {

	public static void main(String[] args) {
		// constructor ex.
		
		Laptop myLaptop1 = new Laptop("Asus", "Zenbook Pro Duo 15 OLED", "Celestial Blue", "Windows 11 Home", 3184.87); // constructor
		Laptop myLaptop2 = new Laptop("MSI", "Titan GT77 12UHS", "Core Black", "Windows 11 Pro", 5163.50);
		
		System.out.println("Laptop information:");
		System.out.println("Brand: " + myLaptop1.brand);
		System.out.println("Model: " + myLaptop1.model);
		System.out.println("Color: " + myLaptop1.color);
		System.out.println("OS: " + myLaptop1.laptopOS);
		System.out.println("Price: " + myLaptop1.price);
		myLaptop1.message();
		System.out.println();
		
		System.out.println("Laptop information:");
		System.out.println("Brand: " + myLaptop2.brand);
		System.out.println("Model: " + myLaptop2.model);
		System.out.println("Color: " + myLaptop2.color);
		System.out.println("OS: " + myLaptop2.laptopOS);
		System.out.println("Price: " + myLaptop2.price);
		myLaptop2.message();
		System.out.println();
		
		
	}

}
