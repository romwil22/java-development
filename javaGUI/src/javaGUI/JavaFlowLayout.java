package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaFlowLayout {

	public static void main(String[] args) {
		// flowlayout ex.
		
		//panel
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,200));
		panel.setBackground(new Color(119,136,153));
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.setLayout(new FlowLayout());
		
		// windows frame
		JFrame windowFrame = new JFrame();
		windowFrame.setTitle("Flowlayout");
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(300,300);
		windowFrame.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
//		windowFrame.add(new JButton("1"));
//		windowFrame.add(new JButton("2"));
//		windowFrame.add(new JButton("3"));
//		windowFrame.add(new JButton("4"));
//		windowFrame.add(new JButton("5"));
		windowFrame.add(panel);
		windowFrame.setVisible(true);
				
	}

}
