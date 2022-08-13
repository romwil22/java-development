package javaProgram;

public class Order {
	private String meal;
	private String drink;
	private double price;
	
	Order(String meal, String drink, double price){
//		this.meal = meal;
//		this.drink = drink;
//		this.price = price;
		
		this.setMeal(meal);
		this.setDrink(drink);
		this.setPrice(price);
	}
	
	// copy object
	Order(Order copyOrder){
		this.copyObject(copyOrder);
	}
	
	// getter methods
	public String getMeal() {
		return meal;
	}
	public String getDrink() {
		return drink;
	}
	public double getPrice() {
		return price;
	}
	
	// setter methods
	public void setMeal(String mealValue) {
		this.meal = mealValue;
	}
	public void setDrink(String drinkValue) {
		 this.drink = drinkValue;
	}
	public void setPrice(double priceValue) {
		 this.price = priceValue;
	}
	
	// copy method
	public void copyObject(Order copy){
		this.setMeal(copy.getMeal());
		this.setDrink(copy.getDrink());
		this.setPrice(copy.getPrice());
	}
}
