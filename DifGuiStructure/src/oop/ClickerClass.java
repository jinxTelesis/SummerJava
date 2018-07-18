package oop;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class ClickerClass extends JFrame {
	
	Timer timer; // swing timer hope this is correct
	int timerCounter;
	int clickCounter;
	JLabel directions, enterTime, clickLabel, timeLeft;
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
		
		reset = new JMenuItem("Reset");
		file.add(reset);
		
		exit = new JMenuItem("Quit");
		file.add(exit);
		
		ResetClass rc = new ResetClass();
		reset.addActionListener(rc);
		
		ExitClass ec = new ExitClass();
		exit.addActionListener(ec);
		
		// top jpanel
		JPanel top = new JPanel();
		top.setLayout(new GridLayout(1, 1));
		
		directions = new JLabel("Enter time, press start, press CLicker repeatedly ");
		top.add(directions);
		pane.add(top);
		
		JPanel middle = new JPanel();
		middle.setLayout(new GridLayout(1, 3));
		
		enterTime = new JLabel("Enter time in seconds: ", SwingConstants.CENTER);
		middle.add(enterTime);
		
		tf = new JTextField();
		middle.add(tf);
		pane.add(middle);
		
		JPanel bottom = new JPanel();
		bottom.setLayout(new GridLayout(1, 3));
		
		clickButton = new JButton("CLICKER");
		clickButton.setEnabled(false);
		bottom.add(clickButton);
		
		clickLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
		bottom.add(clickLabel);
		
		timeLeft = new JLabel("Time left: ?");
		bottom.add(timeLeft);
		pane.add(bottom);
		
		StartButtonClass sbc = new StartButtonClass();
		startButton.addActionListener(sbc);
		
		ClickButtonClass cbc = new ClickButtonClass();
		clickButton.addActionListener(cbc);
		
	}

}
