package javaPolymorphism;

public class Helicopter extends Airship{
	//child class
	@Override
	void departure() {
		System.out.println("Helicopter onboard");
	}
}
