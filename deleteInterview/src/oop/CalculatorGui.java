package oop;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		result = new JLabel("");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 4;
		add(result, c);
		
		event firstEv = new event();
		add.addActionListener(firstEv);
		add.addActionListener(firstEv);
		add.addActionListener(firstEv);
		add.addActionListener(firstEv);
		
		
	}
	
	public class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent firstEv) {
			double number1, number2;
			
			try {
				number1 = Double.parseDouble(num1.getText());
			} catch (NumberFormatException e) {
				result.setText("Please enter numbers only");
				result.setForeground(Color.RED);
				return;
			}
			
			try {
				number2 = Double.parseDouble(num2.getText());
			} catch (NumberFormatException e) {
				result.setText("Please enter numbers only");
				result.setForeground(Color.red);
				return;
			}
			
			String op = firstEv.getActionCommand();
			
			
			
			if(op.equals("+")) {
				double sum = number1 + number2;
				result.setText(number1 + " + " + number2 + " = " + sum);
				result.setForeground(Color.BLUE);
	
			} else if(op.equals("-")) {
				double diff = number1 - number2;
				result.setText(number1 + " - " + number2 + " = " + diff);
				result.setForeground(Color.BLUE);
			} else if(op.equals("*")) {
				double prod = number1 * number2;
				result.setText(number1 + " * " + number2 + " = " + prod);
				result.setForeground(Color.blue);
				
			} else if(op.equals("/")) {
				if(number2 == 0) {
					result.setText("Cannot divide by zero");
					result.setForeground(Color.red);
				}
				else {
				double quot = number1 / number2;
				result.setText(number1 + " / " + number2 + " = " + quot);
				result.setForeground(Color.BLUE);
				}
			}
			
		}
		
		
		
		
	}

}
