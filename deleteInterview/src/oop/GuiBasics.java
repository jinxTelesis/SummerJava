package oop;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiBasics extends JFrame {
	
	JButton button1, button2, button3;
	JLabel label1, label2, label3;
	
	public GuiBasics() {
		setLayout(new GridLayout(2, 3));
		
		button1 = new JButton("button 1");
		add(button1);
		
		label1 = new JLabel("Label 1");
		add(label1);
		
		button2 = new JButton("button 2");
		add(button2);
		
		label2 = new JLabel("Label 2");
		add(label2);
		
		button3 = new JButton("Button 3");
		add(button3);
		
		label3 = new JLabel("Label 3");
		add(label3);
	}

}
