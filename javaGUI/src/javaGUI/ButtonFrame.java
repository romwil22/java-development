package javaGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	boolean emojiVisible = true;
	
	ButtonFrame(){
		//image
		ImageIcon icon = new ImageIcon("arrow-hand.png");
		ImageIcon emoji = new ImageIcon("emoji-happy.png");
		
		//label
		label = new JLabel();
		label.setIcon(emoji);
		label.setBounds(120, 80, 250, 250);
		label.setVisible(false);
		
		
		
		//button
		button = new JButton(); // button create
		button.setBounds(40, 80, 200, 90); // x, y axis position and size
		button.addActionListener(this); // make button functional
		button.setText("Click here");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.RIGHT);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setIconTextGap(20);
		button.setFont(new Font("Comic Sans",Font.BOLD, 16));
		button.setForeground(new Color(30,144,255));
		button.setBackground(new Color(211,211,211));
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false); // disable button
		
		//windows frame
		this.setTitle("Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(300,400);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			if (emojiVisible) {
				label.setVisible(true);
				emojiVisible = false;
			}
			else {
				label.setVisible(false);
				emojiVisible = true;
			}
			
			
		}
		
	}
}
