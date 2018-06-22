package version1;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class memJPanelUpper extends JPanel {
	

	Border blackline, raisedetched, loweredetched,
	raisedbevel, loweredbevel, empty;
	
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
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		jlAttempts = new JLabel(laAttemptStr + attempts);
		jlMatchCou = new JLabel(laMatchCouStr + matches);
		jlScore = new JLabel(laScoreStr + score);
		
		jlAttempts.setAlignmentX(LEFT_ALIGNMENT);
		jlAttempts.setBorder(raisedetched);
		
		jlMatchCou.setAlignmentX(CENTER_ALIGNMENT);
		jlMatchCou.setBorder(raisedetched);
		
		jlScore.setAlignmentX(RIGHT_ALIGNMENT);
		jlScore.setBorder(raisedetched);
		
		add(jlAttempts);
		add(jlMatchCou);
		add(jlScore);
		
	}

}
