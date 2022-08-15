package javaGUI;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaGridLayout {

	public static void main(String[] args) {
		// gridlayout ex.
		
		JFrame windowFrame = new JFrame();
		windowFrame.setTitle("Boderlayout");
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(300,300);
		windowFrame.setLayout(new GridLayout(2,3,2,2)); // gridlayout rows,columns,width,height margin 
		windowFrame.add(new JButton("1"));
		windowFrame.add(new JButton("2"));
		windowFrame.add(new JButton("3"));
		windowFrame.add(new JButton("4"));
		windowFrame.add(new JButton("5"));
		windowFrame.add(new JButton("6"));
		windowFrame.setVisible(true);
	}

}
