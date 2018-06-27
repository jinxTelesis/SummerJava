package calc_additon;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class CalcJPanel extends JPanel{
	
	private JLabel jlDisplay;
	public static final String ADD = "Add";
	public static final String SUB = "Sub";
	public static final String MULT = "Mult";
	public static final String DIV = "Div";
	
	enum BtnFaces {ADD,SUB,MULT,DIV;}
	
	private static final int NUM_COLUMNS = 10;
	
	public CalcJPanel() {
		setLayout(new GridLayout(3,1));
		jlDisplay = new JLabel("Add or Subtract Below");
		jlDisplay.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		
	}
}
