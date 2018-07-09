package oop;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		label = new JLabel("");
		add(label);
		
		event EventAction = new event();
		button.addActionListener(EventAction);
		
	}
	
	public class event implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			counter++;
			if(x == 0)
			{
				s = "time";
			} else if(x == 1) {
				s = "times";
			}
			label.setText("You have clicked " + counter + " " + s);
			x = 1;
			
		}
	}
	
	

}
