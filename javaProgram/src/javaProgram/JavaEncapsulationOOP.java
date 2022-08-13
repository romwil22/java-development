package javaProgram;

public class JavaEncapsulationOOP {

	public static void main(String[] args) {
		// encapsulation ex.
		
		Order customer1 = new Order("1pcs chicken", "Coke", 100.0);
		Order customer2 = new Order("Zinger steak", "iced tea", 150.0);
		
		// get the value
		System.out.println("Customer orders:");
		System.out.println();
		System.out.println(customer1.getMeal());
		System.out.println(customer1.getDrink());
		System.out.println(customer1.getPrice());
		System.out.println();
		System.out.println(customer2.getMeal());
		System.out.println(customer2.getDrink());
		System.out.println(customer2.getPrice());
		System.out.println();
		
		// change of value
		customer1.setMeal("bucket meal");
		customer1.setPrice(600.0);
		customer2.setDrink("Mountain dew");
		
		
		System.out.println("Customer change order:");
		System.out.println();
		System.out.println(customer1.getMeal());
		System.out.println(customer1.getDrink());
		System.out.println(customer1.getPrice());
		System.out.println();
		System.out.println(customer2.getMeal());
		System.out.println(customer2.getDrink());
		System.out.println(customer2.getPrice());
		
	}

}
