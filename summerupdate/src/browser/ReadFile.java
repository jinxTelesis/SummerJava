package browser;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ReadFile extends JFrame {
	
	private JTextField addressBar;
	private JEditorPane display;

	// constructor
	public ReadFile() {
		super("Dre's Browser");
		
		addressBar = new JTextField("enter a URL dude");
		
	}
}
