package oop;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.Timer;

public class ClickerClass extends JFrame {
	
	Timer timer; // swing timer hope this is correct
	int timerCounter;
	int clickCounter;
	JLabel directions, enterTIme, clickLabel, timeLeft;
	JButton startButton, clickButton;
	JTextField tf;
	JMenuBar menubar;
	JMenu file;
	JMenuItem reset, exit;
	
	public ClickerClass() {
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(3, 1, 5, 5));
		
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		file = new JMenu("File");
		menubar.add(file);
		
		reset = JMenuItem("Reset");
		file.add(reset);
		
		exit = JMenuItem("Quit");
		file.add(exit);
	}

}
