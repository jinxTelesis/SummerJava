package oop;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorGui extends JFrame {
	
	JButton add, subtract, multiply, divide;
	JTextField num1, num2;
	JLabel result, enter1, enter2;
	
	public CalculatorGui() {
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		enter1 = new JLabel("1st:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(enter1, c);
		
		num1 = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 3;
		add(num1, c);
		
		enter2 = new JLabel("2nd: ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		add(enter2, c);
		
		
		
		
		
		
	}

}
