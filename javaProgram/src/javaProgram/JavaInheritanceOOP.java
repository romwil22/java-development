package javaProgram;

public class JavaInheritanceOOP {

	public static void main(String[] args) {
		// inheritance ex.
		
		Car car = new Car();
		Bicycle bike = new Bicycle();
		
		System.out.println("Car inheritance ex.");
		System.out.println("Car model: "+car.carModel);
		car.accelerate();
		car.brake();
		System.out.println();
		
		System.out.println("Bike inheritance ex.");
		System.out.println("Bike model: "+bike.frameModel);
		bike.accelerate();
		bike.brake();
	}

}
