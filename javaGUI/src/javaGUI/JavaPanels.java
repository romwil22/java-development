package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaPanels {

	public static void main(String[] args) {
		// panels ex.
		// to be continue...
		
		// image
		ImageIcon image = new ImageIcon("logo.png");
		
		// labels
		
		//blue panel
		JLabel label1 = new JLabel();
		label1.setText("primary color");
		label1.setIcon(image);
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.BOTTOM);
		//label1.setVerticalAlignment(JLabel.CENTER);
		//label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBounds(225, 0, 300, 300); // for border use
		
		//red panel
		JLabel label2 = new JLabel();
		label2.setText("primary color");
		label2.setIcon(image);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		label2.setVerticalAlignment(JLabel.TOP);
		label2.setHorizontalAlignment(JLabel.LEFT);
		
		
		//green panel
		JLabel label3 = new JLabel();
		label3.setText("primary color");
		label3.setIcon(image);
		label3.setHorizontalTextPosition(JLabel.CENTER);
		label3.setVerticalTextPosition(JLabel.BOTTOM);
		label3.setVerticalAlignment(JLabel.TOP);
		label3.setHorizontalAlignment(JLabel.RIGHT);
		
		// panels
		JPanel redPanel = new JPanel(); // create panel
		redPanel.setBackground(new Color(255,0,0)); // set background color
		redPanel.setBounds(0, 0, 300, 300); // set position and size
		redPanel.setLayout(new BorderLayout());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(new Color(0,128,0));
		greenPanel.setBounds(300, 0, 300, 300);
		greenPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(new Color(0,0,255));
		bluePanel.setBounds(0, 300, 600, 300);
		bluePanel.setLayout(null);
		
		
		// windows frame
		JFrame windowFrame = new JFrame();
		windowFrame.setTitle("Panels");
		windowFrame.setSize(700,700);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setLayout(null);
		windowFrame.setVisible(true);
		redPanel.add(label2);
		greenPanel.add(label3);
		bluePanel.add(label1);
		windowFrame.add(redPanel);
		windowFrame.add(greenPanel);
		windowFrame.add(bluePanel);

	}

}
