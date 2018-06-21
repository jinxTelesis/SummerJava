package version1;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class memJPanelUpper extends JPanel {
	
	
	
	private int attempts = 0;
	private int matches = 0;
	private int score = 0;
	
	private JLabel jlAttempts;
	private JLabel jlMatchCou;
	private JLabel jlScore;
	// add in numbers to update in jpanel base
	private String laAttemptStr = "Attempts : "; // need to base off number later
	private String laMatchCouStr = "Matches Found : ";
	private String laScoreStr = "Score : ";
	
	public memJPanelUpper() {
		jlAttempts = new JLabel(laAttemptStr + attempts);
		jlMatchCou = new JLabel(laMatchCouStr + matches);
		jlScore = new JLabel(laScoreStr + score);
		jlAttempts.setAlignmentX(LEFT_ALIGNMENT);
		jlMatchCou.setAlignmentX(CENTER_ALIGNMENT);
		jlScore.setAlignmentX(RIGHT_ALIGNMENT);
		
		add(jlAttempts);
		add(jlMatchCou);
		add(jlScore);
		
	}

}
