package javaProgram;

import java.util.ArrayList;

public class Java2DArrayList {

	public static void main(String[] args) {
		// 2d array list ex
		
		// list of snacks
		ArrayList<String> snackList = new ArrayList();
		snackList.add("Pringles");
		snackList.add("Lays");
		snackList.add("Chiatos");
		
		// list of drinks
		ArrayList<String> drinkList = new ArrayList<>();
		drinkList.add("Coke");
		drinkList.add("Pepsi");
		
		//list of sweet
		ArrayList<String> chocolateList = new ArrayList<>();
		chocolateList.add("Cadbury");
		chocolateList.add("Toblerone");
		chocolateList.add("Maltezers");
		
		ArrayList<ArrayList<String>> storeList = new ArrayList();
		storeList.add(snackList);
		storeList.add(drinkList);
		storeList.add(chocolateList);
		
		System.out.println("List of product\n");
		
		// print list of product
		for (int i = 0; i < storeList.get(0).size(); i++) {
			System.out.println(storeList.get(0).get(i));
		}
		System.out.println();
		for (int i = 0; i < storeList.get(1).size(); i++) {
			System.out.println(storeList.get(1).get(i));
		}
		System.out.println();
		for (int i = 0; i < storeList.get(2).size(); i++) {
			System.out.println(storeList.get(2).get(i));
		}
		
	}

}
