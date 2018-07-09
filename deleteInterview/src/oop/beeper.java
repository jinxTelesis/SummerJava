package oop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class beeper extends JFrame {
	JButton button;
	JLabel label;
	int counter = 0, x =0;
	String s;
	
	public beeper() {
		setLayout(new FlowLayout());
		button = new JButton("CLICK FOR SOUND");
		add(button);
	}

}
