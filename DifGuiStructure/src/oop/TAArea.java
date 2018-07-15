package oop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TAArea extends JFrame {
	JTextArea textarea;
	JButton button;
	JLabel label;
	
	public TAArea() {
		setLayout(new FlowLayout());
		
		textarea = new JTextArea(5,30);
		add(textarea);
		
		button = new JButton("CLick here for text area");
		add(button);
		
		label = new JLabel("");
		add(label);
		
		event e = new event();
		button.addActionListener(e);
		
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String text = textarea.getText();
			
			label.setText(text);
		}
	}

}
