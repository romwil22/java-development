package javaProgram;

import java.util.Random;

public class DiceRoller {
	Random random; // global variable
	int diceNumber; // global variable
	
	DiceRoller(){
		//Random random = new Random(); // local variable
		//int diceNumber = 0; // local variable
		//diceRoll(random, diceNumber);
		
		random = new Random();
		diceRoll();
	}
	
	void diceRoll() {
		diceNumber = random.nextInt(6) + 1;
		System.out.println(diceNumber);
	}
	
}
