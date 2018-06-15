package drawoval;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class TheWindow extends JFrame {
	
	private JSlider slider;
	private DrawOval myPanel;
	
	public TheWindow() {
		super("The title");
		myPanel = new DrawOval();
		myPanel.setBackground(Color.lightGray);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		
	}

}
