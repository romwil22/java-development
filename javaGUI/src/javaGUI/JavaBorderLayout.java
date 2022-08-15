package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaBorderLayout {

	public static void main(String[] args) {
		// border layout ex.
		
		//panel
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(new Color(255,0,0));
		panel2.setBackground(new Color(0,255,0));
		panel3.setBackground(new Color(0,0,255));
		panel4.setBackground(new Color(255,255,0));
		panel5.setBackground(new Color(0,255,255));
		
		panel1.setPreferredSize(new Dimension(50,50));
		panel2.setPreferredSize(new Dimension(50,50));
		panel3.setPreferredSize(new Dimension(50,50));
		panel4.setPreferredSize(new Dimension(50,50));
		panel5.setPreferredSize(new Dimension(50,50));
		
		//sub panel
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(new Color(128,128,128));
		panel7.setBackground(new Color(128,0,0));
		panel8.setBackground(new Color(128,128,0));
		panel9.setBackground(new Color(0,128,0));
		panel10.setBackground(new Color(128,0,128));
		
		
		
		panel6.setPreferredSize(new Dimension(25,25));
		panel7.setPreferredSize(new Dimension(25,25));
		panel8.setPreferredSize(new Dimension(25,25));
		panel9.setPreferredSize(new Dimension(25,25));
		panel10.setPreferredSize(new Dimension(25,25));
	
		panel5.setLayout(new BorderLayout(5,5));
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.EAST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		// windows frame
		JFrame windowFrame = new JFrame();
		windowFrame.setTitle("Boderlayout");
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(400,400);
		windowFrame.setLayout(new BorderLayout(5,5)); // border margin
		windowFrame.add(panel1,BorderLayout.NORTH);
		windowFrame.add(panel2,BorderLayout.SOUTH);
		windowFrame.add(panel3,BorderLayout.WEST);
		windowFrame.add(panel4,BorderLayout.EAST);
		windowFrame.add(panel5,BorderLayout.CENTER);
		windowFrame.setVisible(true);
		
		

	}

}
