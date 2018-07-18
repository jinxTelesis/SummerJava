package oop;

import java.awt.GridLayout;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TimerPro extends JFrame {
	
	JLabel promptLabel, timerLabel;
	int counter;
	JTextField tf;
	JButton button;
	Timer timer; // might be wrong input using one from util
	
	public TimerPro() {
		setLayout(new GridLayout(2, 2, 5, 5));
		
		promptLabel = new JLabel("Enter seconds: ", SwingConstants.CENTER);
		add(promptLabel);
		
		tf = new JTextField(5);
		add(tf);
		
		button = new JButton("Start timing");
		add(button);
		
		timerLabel = new JLabel("Waiting...", SwingConstants.CENTER);
		add(timerLabel);
		
		
		
		
	}
	

}
