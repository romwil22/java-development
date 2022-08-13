package javaProgram;

public class JaveObjectPassing {

	public static void main(String[] args) {
		// object passing ex.
		
		RagnarokTown payon = new RagnarokTown();
		
		RagnarojJob character1 = new RagnarojJob("Sworman");
		RagnarojJob character2 = new RagnarojJob("Hunter");
		RagnarojJob character3 = new RagnarojJob("Wizard");
		
		
		payon.town(character1); // passing object
		payon.town(character2);
		payon.town(character3);
	}

}
