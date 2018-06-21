package version1;

import javax.swing.JPanel;

public class memJPanelBase extends JPanel {
	
	memJPanelBase(){
		memJPanelUpper jpUpper = new memJPanelUpper();
		memJPanelMid jpMid = new memJPanelMid();
		memJPanelBot jpBot = new memJPanelBot();
		
		add(jpUpper);
		add(jpMid);
		add(jpBot);
	}

}
