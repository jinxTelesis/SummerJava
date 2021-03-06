package oop;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import oop.TimerPro.TimeClass;

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
		
		startButton = new JButton("Starter");
		startButton.setEnabled(true);
		bottom.add(startButton);
		
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
	
	public class StartButtonClass implements ActionListener {
		public void actionPerformed(ActionEvent sbc) {
			// start timer, set couple buttons to false another to true 
			// catch an exception 
			
			try {
				int timeCount = (int)(Double.parseDouble(tf.getText()));
				
				if(timeCount <= 0) {
					tf.setText("Positive numbers!");
				}
				else {
					timeLeft.setText("Time left: " + timeCount);
					TimeClass tc = new TimeClass(timeCount);
					timer = new Timer(1000, tc);
					timer.start(); // swing timer
					startButton.setEnabled(false);
					clickButton.setEnabled(true);
				}
				
				
			} catch(NumberFormatException ex) {
				tf.setText("Numbers only!");
			}
			
		}
		
	}
	
	public class ClickButtonClass implements ActionListener{
		public void actionPerformed(ActionEvent cbd) {
			clickCounter++;
			clickLabel.setText("Clicks: " +clickCounter);
		}
	}
	
	public class ExitClass implements ActionListener{
		public void actionPerformed(ActionEvent ec) {
			System.exit(0);
		}
	}
	
	public class TimeClass implements ActionListener{
		int timerCounter;
		
		public TimeClass(int timerCounter) {
			this.timerCounter = timerCounter;
		}
		
		public void actionPerformed(ActionEvent tc) {
			timerCounter--;
			
			if(timerCounter >= 1) {
				timeLeft.setText("Time left: " + timerCounter);
				
			}
			else {
				timer.stop();
				timeLeft.setText("Done");
				clickButton.setEnabled(false); // make it unclickable
				Toolkit.getDefaultToolkit().beep(); // adds sound
				
			}
		}
	}
	
	public class ResetClass implements ActionListener{
		public void actionPerformed(ActionEvent rc) {
			clickButton.setEnabled(false);
			startButton.setEnabled(true);
			clickCounter = 0;
			clickLabel.setText("Clicks: O");
			tf.setText("");
			timeLeft.setText("Time left: ?");
			
		}
	}

}
