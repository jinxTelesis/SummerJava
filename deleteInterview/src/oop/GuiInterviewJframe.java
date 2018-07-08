package oop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuiInterviewJframe extends JFrame {
	
	private JLabel label;
	private JButton button;
	private JTextField textfield;
	
	
	public GuiInterviewJframe() {
		setLayout(new FlowLayout());
		
		label = new JLabel("Hi, sup bro");
		add(label);
		
		textfield = new JTextField(15);
		add(textfield);
		
		button = new JButton("Moo");
		add(button);
		
		
	}
	
	public static void main(String args[]) {
	
	
	
	
	}
}
