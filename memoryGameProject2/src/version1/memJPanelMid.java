package version1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class memJPanelMid extends JPanel implements ActionListener {
	
	private JButton[] imageButtons; 
	
	public memJPanelMid() {
		
		imageButtons = new JButton[36];
		
		for (int i = 0; i < 36; i++) {
			imageButtons[i] = new JButton(Integer.toString(i));
			add(imageButtons[i]);
			imageButtons[i].addActionListener(this);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
