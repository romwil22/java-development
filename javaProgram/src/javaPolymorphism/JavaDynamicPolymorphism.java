package javaPolymorphism;

import java.util.Scanner;

public class JavaDynamicPolymorphism {

	public static void main(String[] args) {
		// dynamic polymorphism ex.
		
		Scanner userInput = new Scanner(System.in);
		Xiaomi xiaomi;
		
		System.out.println("Choose the device to visit:");
		System.out.println("1. Mi Phones");
		System.out.println("2. Redmi Phones");
		System.out.println("3. POCO Phones");
		System.out.print("Choice (1-3): ");
		int yourChoice = userInput.nextInt();
		
		if (yourChoice == 1) {
			xiaomi = new MiPhones();
			xiaomi.menu();
		}
		else if (yourChoice == 2) {
			xiaomi = new RedmiPhones();
			xiaomi.menu();
		}
		else if (yourChoice == 3) {
			xiaomi = new Poco();
			xiaomi.menu();
		}
		else {
			xiaomi = new Xiaomi();
			System.out.println("Invalid input");
			xiaomi.menu();
		}
	}

}
