package javaGUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JavaLayeredPane {

	public static void main(String[] args) {
		// layered pane ex.
		
		//labels
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(new Color(255,0,0));
		label1.setBounds(25,25,250,250);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(new Color(0,128,0));
		label2.setBounds(50,50,250,250);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(new Color(0,0,255));
		label3.setBounds(75,75,250,250);
		
		//layered pane
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,400,400);
		
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(1));
		layeredPane.add(label3, Integer.valueOf(2));
		
		//windows frame
		JFrame windowFrame = new JFrame();
		windowFrame.setTitle("Layeredpane");
		windowFrame.add(layeredPane);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(new Dimension(400,400));
		windowFrame.setLayout(null);
		windowFrame.setVisible(true);

	}

}
