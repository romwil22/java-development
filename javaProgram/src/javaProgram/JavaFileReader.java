package javaProgram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaFileReader {

	public static void main(String[] args) {
		// file reader ex.
		
		try {
			FileReader readFile = new FileReader("ascii_art.txt");
			int readData = readFile.read();
			
			while (readData != -1) {
				System.out.print((char)readData);
				readData = readFile.read();;
			}
			readFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
