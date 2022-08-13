package javaProgram;

public class JavaCopyObjects {

	public static void main(String[] args) {
		// copy object ex.
		
		Order customer1 = new Order("1pcs chicken", "Coke", 100.0);
//		Order customer2 = new Order("2pcs chicken", "Pepsi", 149.0);
//		customer2.copyObject(customer1); // making copy of customer1
		Order customer2 = new Order(customer1); // alternative way to copy
		
		System.out.println("memory address:");
		System.out.println("customer1 address: "+customer1);
		System.out.println("customer2 address: "+customer2);
		System.out.println();
		
		System.out.println("Order List:");
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
