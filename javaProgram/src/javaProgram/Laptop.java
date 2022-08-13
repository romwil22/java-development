package javaProgram;

public class Laptop {
	String brand;
	String model;
	String color;
	String laptopOS;
	double price;
	
	Laptop(String brand, String model,String color,String laptopOS, double price){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.laptopOS = laptopOS;
		this.price = price;
		
	}
	
	void message() {
		System.out.println("Thank you for choosing " + this.brand);
	}
}
