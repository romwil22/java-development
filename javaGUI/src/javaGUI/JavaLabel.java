package javaGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JavaLabel {

	public static void main(String[] args) {
		// labels ex.
		
		//image
		ImageIcon image = new ImageIcon("logo.png");
		
		// border
		Border border = BorderFactory.createLineBorder(new Color(47,79,79),3);
		
		// label
		JLabel label = new JLabel(); // create label
		label.setText("java GUI application"); // set text in label
		label.setIcon(image); // set image in label
		label.setHorizontalTextPosition(JLabel.CENTER); // align label CENTER, BUTTON, LEFT, RIGHT
		label.setVerticalTextPosition(JLabel.TOP); // align label CENTER, BUTTON, LEFT, RIGHT
		label.setForeground(new Color(0,0,128)); // set fore color of label
		label.setFont(new Font("MV Boli",Font.PLAIN,16)); // set font text 
		label.setIconTextGap(5); // set gap between text and image
		label.setBackground(new Color(192,192,192)); // set background color of label
		label.setOpaque(true); // set to display background color
		label.setBorder(border); // set border
		label.setHorizontalAlignment(JLabel.CENTER); // set alignment of image and label vertically
		label.setHorizontalAlignment(JLabel.CENTER); // set alignment of image and label horizontally
		//label.setBounds(100, 90, 225, 225); // set position of x, y axis and frame dimension
		
		// windows frame
		JFrame windowFrame = new JFrame();
		windowFrame.setTitle("Labels");
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//windowFrame.setResizable(false);
		//windowFrame.setSize(450,450);
		//windowFrame.setLayout(null);
		windowFrame.setVisible(true);
		windowFrame.add(label);
		windowFrame.pack(); // alternate way, add all the component before add
		
	}

}
