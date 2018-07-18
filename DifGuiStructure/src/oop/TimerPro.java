package oop;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

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
		
		event e = new event();
		button.addActionListener(e);
		
		
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int count = (int) (Double.parseDouble(tf.getText()));
			timerLabel.setText("Time left: " + count);
			
			TimeClass tc = newTimeClass(count);
			timer = new Timer(1000, tc);
			timer.start();
		}
	}
	
	public class TimeClass implements ActionListener{
		int counter;
		
		public TimeClass(int counter) {
			this.counter = counter;
			
		}
		
		public void actionPerformed(ActionEvent tc) {
			counter--;
			
			if(counter >= 1) {
				timerLabel.setText("Time left: " + counter);
			}
			else
			{
				timer.stop();
				timerLabel.setText("Done!");
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
	}
	

}
