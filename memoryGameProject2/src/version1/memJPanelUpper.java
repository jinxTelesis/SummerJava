package version1;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class memJPanelUpper extends JPanel {
	
	private JLabel jlAttempts;
	private JLabel jlMatchCou;
	private JLabel jlScore;
	// add in numbers to update in jpanel base
	private String laAttemptStr = "Attempts : 0"; // need to base off number later
	private String laMatchCouStr = "Matches Found : ";
	private String laScoreStr = "Score : ";
	
	public memJPanelUpper() {
		jlAttempts = new JLabel(laAttemptStr);
		jlMatchCou = new JLabel(laMatchCouStr);
		jlScore = new JLabel(laScoreStr);
		
		
	}

}
