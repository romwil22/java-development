package javaProgram;

public class BuyingList {
	String snack;
	String drink;
	String meal;
	String dessert;
	
	BuyingList(String snack, String drink, String meal, String dessert){
		this.snack = snack;
		this.drink = drink;
		this.meal = meal;
		this.dessert = dessert;
	}
	BuyingList(String snack, String drink){
		this.snack = snack;
		this.drink = drink;
	}
	BuyingList(String drink, String meal, String dessert){
		this.drink = drink;
		this.meal = meal;
		this.dessert = dessert;
	}
	BuyingList(String snack){
		this.snack = snack;
	}
	
	
}
