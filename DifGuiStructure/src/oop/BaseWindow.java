package oop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BaseWindow extends JFrame implements ActionListener{
	
	JMenuBar menubar;
	JMenu help;
	JMenuItem about;
	
	public BaseWindow() {
		setLayout(new FlowLayout());
		
		
		menubar = new JMenuBar();
		add(menubar);
		
		help = new JMenu("Help");
		menubar.add(help);
		
		about = new JMenuItem("About");
		help.add(about);
		
		setJMenuBar(menubar);
		
		eventclass e = new eventclass();
		about.addActionListener(e);
		
	}
	
	public class eventclass implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			HelpWindow gui = new HelpWindow(BaseWindow.this); // this call other class
			gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			gui.setSize(300,100);
			gui.setLocation(300, 300);
			gui.setVisible(true);
			
			
		}
	}
	
	public static void main(String args[]) {
		BaseWindow gui = new BaseWindow();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,100);
		gui.setVisible(true);
		gui.setTitle("Main Windowww");
		
		TAArea gui2 = new TAArea();
		gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui2.setSize(300, 300);
		gui2.setVisible(true);
		gui2.setTitle("Interview title");

	}

}
