package javaProgram;

public class JavaMethodOverriding {

	public static void main(String[] args) {
		// method overriding ex.
		
		Novice newplayer1 = new Novice();
		FirstJob newplayer1JobChange = new FirstJob();
		
		newplayer1.newbie(); // from parent class
		newplayer1JobChange.newbie(); // from child class

	}

}
