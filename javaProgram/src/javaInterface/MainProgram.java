package javaInterface;

public class MainProgram {

	public static void main(String[] args) {
		// interface ex.
		
		Rabbit prey = new Rabbit(); // implement prey interface
		Hawk predator = new Hawk(); // implement predator interface
		Fish preyPredator = new Fish(); // applied both interface prey and predator
		
		
		prey.fleeing();
		predator.hunting();
		preyPredator.hunting();
		preyPredator.fleeing();

	}

}
