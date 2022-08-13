package javaInterface;

public class Fish implements Prey,Predator{

	@Override
	public void hunting() {
		System.out.println("The fish fleeing on predator");
		
	}

	@Override
	public void fleeing() {
		
		System.out.println("Fish hunting the prey");
	}
	
}
