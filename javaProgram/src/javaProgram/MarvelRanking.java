package javaProgram;

public class MarvelRanking {
	// parent class
	
	String name;
	int rank;
	
	
	MarvelRanking(String name, int rank){
		this.name = name;
		this.rank = rank;
	}
	
	public String toString() {
		return "Hero Name: "+this.name+"\n"+"Rank: "+this.rank+"\n";
	}
}
