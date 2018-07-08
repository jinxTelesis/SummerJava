package oop;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class GuiInterviewJframe extends JFrame  {
	private JLabel label;
	private JButton button;
	private JButton button2;
	private JLabel label2;
	
	public GuiInterviewJframe() {
		setLayout(new FlowLayout());
		
		button = new JButton("Click for text");
		add(button);
		
		button2 = new JButton("Rocket baby");
		add(button2);
		
		label = new JLabel("");
		add(label);
		
		label2 = new JLabel("");
		add(label2);
		
		event theEvent = new event();
		button.addActionListener(theEvent);
		event theEvent2 = new event();
		button2.addActionListener(theEvent2);
		
	}
	
	public class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			label.setText("Now you can see words here");
		}
		
	}
	
	public static void main(String args[])
	{
		GuiInterviewJframe gui = new GuiInterviewJframe();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("Event listeners");
		gui.setSize(300,1000);
		gui.setVisible(true);
		
	}
	
	

}
