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
		
		num2 = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 3;
		add(num2, c);
		
		add = new JButton("+");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		add(add, c);
		
		subtract = new JButton("-");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		add(subtract, c);
		
		multiply = new JButton("*");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		add(multiply, c);
		
		divide = new JButton("/");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		add(divide, c);
		
		
		
		
	}

}
