package javaGUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JavaJFrame {

	public static void main(String[] args) {
		// creating a window frame in java ex.
		
		// window frame set-up
//		JFrame windowFrame = new JFrame(); // create frame
//		
//		windowFrame.setTitle("window frame example"); // set a title in window
//		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the application. others option DONOTHING_ON_CLOSE & HIDE_ON_CLOSE
//		windowFrame.setResizable(false); // fix the size of resizable window
//		windowFrame.setSize(350,350); // set window frame size x and y dimension
//		windowFrame.setVisible(true); // set visibility of application
//		windowFrame.getContentPane().setBackground(Color.blue);;
		
		// icon set-up
//		ImageIcon icon = new ImageIcon("R.png"); // change image icon in window frame
//		windowFrame.setIconImage(icon.getImage()); // set an icon in window frame
		
		MyOwnFrame ownFrame = new MyOwnFrame(); // instance of class

	}

}
