package javaPolymorphism;

public class Airplane extends Airship{
	//child class
	@Override
	void departure() {
		System.out.println("Airplane onboard");
	}
}
