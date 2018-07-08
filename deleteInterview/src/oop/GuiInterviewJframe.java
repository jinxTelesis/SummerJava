package oop;


import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class GuiInterviewJframe extends JFrame  {
	private ImageIcon image;
	private JLabel label1;
	private ImageIcon image2;
	private JLabel label2;
	
	GuiInterviewJframe(){
		setLayout(new FlowLayout());
		
		image = new ImageIcon(getClass().getResource("images/image0.jpg"));
		label1 = new JLabel(image);
		add(label1);
		
		image2 = new ImageIcon(getClass().getResource("images/image1.jpg"));
		label2 = new JLabel(image2);
		add(label2);
	}
	
	public static void main(String args[]){
		GuiInterviewJframe gui = new GuiInterviewJframe();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		//gui.setSize(500,400);
		gui.pack();
		gui.setTitle("Image program baby");
		
		
	}
	

}
