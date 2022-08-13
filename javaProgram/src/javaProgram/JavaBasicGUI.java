package javaProgram;

import javax.swing.JOptionPane;

public class JavaBasicGUI {

	public static void main(String[] args) {
		// user input name
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Welcome to java programming " + name);
		
		// user input weather
		double weather = Double.parseDouble(JOptionPane.showInputDialog("Enter today weather"));
		JOptionPane.showMessageDialog(null, "The City weather is " + weather);
		
		// user input rate
		
		int rate = Integer.parseInt(JOptionPane.showInputDialog("rate this program (1-5)"));
		JOptionPane.showMessageDialog(null, "Your rating is " + rate);
	}

}
