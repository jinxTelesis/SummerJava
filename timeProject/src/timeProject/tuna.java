package timeProject;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tuna extends JFrame {
	
	private JLabel item1;
	
	public tuna() {
		super("The title bar"); // overrides JFRAME DEFAULT?
		setLayout(new FlowLayout()); // default layout
		
		item1 = new JLabel("this is a sentwfds");
		item1.setToolTipText("This is gonna show up on hover");
		add(item1);
	}
	
}
