package version1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


public class memJPanelBase extends JPanel {
	
	private final int hGap = 5;
    private final int vGap = 5;
	
	memJPanelBase(){
	init();	// method for construction
	
	
	
	
	}

	private void init() {
		Border blackline, raisedetched, loweredetched,
		raisedbevel, loweredbevel, empty;

		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		FlowLayout flowLayObj = new FlowLayout(0,35, 35);
		
		memJPanelUpper jpUpper = new memJPanelUpper();
		jpUpper.setBorder(blackline);
		jpUpper.setLayout(flowLayObj);
		
		GridLayout GridLayObj = new GridLayout(5,7);
		memJPanelMid jpMid = new memJPanelMid();
		jpMid.setLayout(GridLayObj);
		jpMid.setBorder(blackline);
		
		
		memJPanelBot jpBot = new memJPanelBot();
		jpBot.setLayout(flowLayObj);
		jpBot.setBorder(blackline);
		
		
		add(jpUpper);
		add(jpMid);
		add(jpBot);
		
	}

}
