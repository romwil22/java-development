package javaProgram;

public class FirstJob extends Novice{
	//child class
	
	// override parent method, own implementation
	@Override
	void newbie() {
		System.out.println("Great Job now your an archer");
	}
}
