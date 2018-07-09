package oop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menuTutorial extends JFrame {
	
	private JMenuBar menubar;
	private JMenu file;
	private JMenuItem exit;
	
	public menuTutorial() {
		setLayout(new FlowLayout());
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		file = new JMenu("File");
		menubar.add(file);
		
		exit = new JMenuItem("Exit");
		file.add(exit);
		
		event e = new event();
		exit.addActionListener(e);
		
	}
	
	public class event implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			
		}
	}

}
