package oop;

import java.awt.FlowLayout;

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
		
		file = new JMenu();
		menubar.add(file);
		
	}

}
