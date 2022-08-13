package javaProgram;

public class JavaSuperKeyword {

	public static void main(String[] args) {
		// super keyword ex.
		
		HeroRank character1 = new HeroRank("Captain America", 28, "Martial arts, hand-to-hand combat");
		HeroRank character2 = new HeroRank("Daredevil", 29, "Sense of touch");
		HeroRank character3 = new HeroRank("Hulk", 12, "Superhuman strength");
		
		System.out.println("Marvel superhero ranking:");
		System.out.println();
		System.out.println(character1.toString());
		System.out.println();
		System.out.println(character2.toString());
		System.out.println();
		System.out.println(character3.toString());

	}

}
