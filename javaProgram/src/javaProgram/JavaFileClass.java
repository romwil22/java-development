package javaProgram;

import java.io.File;

public class JavaFileClass {

	public static void main(String[] args) {
		// file class ex.
		
		File fileName = new File("message.txt");
		//File fileName = new File("C:\\Users\\Rom\\eclipse-workspace\\java\\ProgramexMessage.txt"); // alternate way
		
		if (fileName.exists()) {
			System.out.println("File \""+ fileName.getPath() + "\" exist");
			System.out.println("File \""+ fileName.getAbsolutePath() + "\" exist, full path");
			System.out.println("File is "+ fileName.isFile());
			fileName.delete(); // delete the file
			System.out.println("file is deleted");
		} else {
			System.out.println("file not exist, try again");
		}
		

	}

}
