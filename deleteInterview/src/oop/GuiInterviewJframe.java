package oop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuiInterviewJframe extends JFrame  {
	int randomNum, guess;
	private JButton button;
	private JTextField textfield;
	private JLabel promptLabel;
	private JLabel resultLabel;
	private JLabel randomLabel;
	
	public GuiInterviewJframe() {
		// added layout
		setLayout(new FlowLayout());
		
		promptLabel = new JLabel("Enter a random number 1-10");
		add(promptLabel);
		
		textfield = new JTextField(5);
		add(textfield);
		
		button = new JButton("Guess!");
		add(button);
		
		resultLabel = new JLabel("");
		add(resultLabel);
		
		randomLabel = new JLabel("");
		add(randomLabel);
		
		event e = new event();
		button.addActionListener(e);
	}
	
	public class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			randomNum = (int)(Math.random() * 10 + 1);
			
			try {
				guess = (int)(Double.parseDouble(textfield.getText()));
				
				if(guess == randomNum)
				{
					resultLabel.setText("you won the game");
				}
				else
				{
					resultLabel.setText("you lost the game!");
				}
				randomLabel.setText("The random number generated was : " + randomNum);
				
			} catch (Exception exc) { 
				randomLabel.setText("Please enter numbers only!");
			}
		}
		

		
	}
	
	public static void main (String ars[])
	{
		//GuiInterviewJframe gui = new GuiInterviewJframe();
		//menuTutorial gui = new menuTutorial();
		
		//beeper gui = new beeper();
		
		GuiBasics gui = new GuiBasics();
		
		
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
		gui.setTitle("Wonder interview program");
		
		
	}
	

}
