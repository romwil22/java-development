package javaProgram;

public class JavaOverloadedConstructors {

	public static void main(String[] args) {
		// overloaded constructors ex.
		
		BuyingList order1 = new BuyingList("Pringles", "Coke", "Chicken rice", "Muffin");
		BuyingList order2 = new BuyingList("Mountain dew", "Pork and rice", "Cinnamon");
		BuyingList order3 = new BuyingList("Cheetos", "Pepsi");
		BuyingList order4 = new BuyingList("Lays");
		
		System.out.println("Customer order:");
		System.out.println("order 1: " + order1.snack + ", " + order1.drink + ", " + order1.meal + ", " + order1.dessert);
		System.out.println("order 1: " + order2.drink + ", " + order2.meal + ", " + order2.dessert);
		System.out.println("order 3: " + order3.snack + ", " + order3.drink);
		System.out.println("order 4: " + order4.snack);
		
	}

}
