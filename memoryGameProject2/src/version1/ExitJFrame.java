package version1;

import javax.swing.JFrame;

public class ExitJFrame extends JFrame{
	
	private ExitJPanel exitJP;
	public ExitJFrame() {
		exitJP = new ExitJPanel();
		add(exitJP);
	}

}
