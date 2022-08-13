package javaProgram;

public class HeroRank extends MarvelRanking{
	// child class
	
	String power;
	
	HeroRank(String name, int rank, String power){
		super(name,rank); // from parent class
		this.power = power;
	}
	
	public String toString() {
		return super.toString()+"Power: "+this.power;
	}
}
