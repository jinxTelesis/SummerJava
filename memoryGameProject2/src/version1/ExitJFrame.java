package version1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ExitJFrame extends JFrame implements ActionListener{
	
	private ExitJPanel exitJP;
	public ExitJFrame() {
		exitJP = new ExitJPanel();
		add(exitJP);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
