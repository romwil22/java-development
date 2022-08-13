package javaProgram;

import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {

	public static void main(String[] args) {
		// file writer ex.
		
		try {
			FileWriter writeFile = new FileWriter("shoplist.txt");
			writeFile.write("List to buy:\ndrinks\nsnacks\nmeal"); // writing text to file
			writeFile.append("\nReady to party!");
			System.out.println("file created check to folder");
			writeFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
