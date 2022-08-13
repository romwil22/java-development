package javaGUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyOwnFrame extends JFrame{
	// child class
	
	MyOwnFrame(){
		this.setTitle("window frame example"); // set a title in window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the application. others option DONOTHING_ON_CLOSE & HIDE_ON_CLOSE
		this.setResizable(false); // fix the size of resizable window
		this.setSize(350,350); // set window frame size x and y dimension
		this.setVisible(true); // set visibility of application
		this.getContentPane().setBackground(Color.blue);;
		
		ImageIcon icon = new ImageIcon("R.png");
		this.setIconImage(icon.getImage()); // set an icon in window frame
	}
}
