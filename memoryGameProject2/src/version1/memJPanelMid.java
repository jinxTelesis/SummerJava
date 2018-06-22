package version1;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

// if exit is clicked bring up new frame and panel asking to exit
// need to build her special constructor
// need to test if one card object equals another
// might need to make a card object not just these image arrays
// gui needs popup mess to quit
// 

public class memJPanelMid extends JPanel implements ActionListener {
	
	
	private enum Actions{
		Button00,Button1,Button2,Button3,Button4,Button5,
		Button6,Button7,Button8,Button9,Button10,Button11,
		Button12,Button13,Button14,Button15,Button16,Button17,
		Button18,Button19,Button20,Button21,Button22,Button23,
		Button24,Button25,Button26,Button27,Button28,Button29,
		BUtton30,Button31,Button32,Button33,Button34,Button35;	
	}
	
	
	private ImageIcon[] ic_reg = new ImageIcon[36]; 
	private ImageIcon[] ic_logo = new ImageIcon[36];
	private JButton[] imageButtons;
	private JButton test1;
	private ImageIcon ic_regQue;
	private ImageIcon ic_logoQue;
	
	
	public memJPanelMid() {
		//C:\Users\dremo\eclipse-workspace
		ic_regQue = new ImageIcon("images/qmark.jpg"); // the question mark
		ic_logoQue = new ImageIcon(((Image) ic_regQue.getImage()).getScaledInstance(100, 100, Image.SCALE_FAST)); //the question mark
		
		imageButtons = new JButton[36]; 
		
		for (int i = 0; i < 36; i++) {
			ic_reg[i] = new ImageIcon("images/image" + Integer.toString(i) +".jpg");
			ic_logo[i] = new ImageIcon(((Image) ic_reg[i].getImage()).getScaledInstance(100, 100, Image.SCALE_FAST));
		}
		
		ic_logo = RandomizeArray(ic_logo); // is this valid in java? bad to reorganize an array while using it in python
		
		for (int i = 0; i < 36; i++) {
			imageButtons[i] = new JButton(ic_logo[i]);
			add(imageButtons[i]);
			imageButtons[i].setActionCommand(Actions.Button00.name());
			imageButtons[i].addActionListener(this);
			imageButtons[i].setPreferredSize(new Dimension(175, 100));
		}
		
		hideCard(imageButtons, ic_logoQue);
		//jb00.setActionCommand(Actions.Button00.name());
		//jb00.addActionListener(this);

	}
	
	private static void hideCard(JButton[] imageButtons, ImageIcon Queimage) {
		for(int i = 0; i <imageButtons.length; i++)
		{
			imageButtons[i].setIcon(Queimage);
		}
		
	}
	
	
	@Override // should do enumerations for this easier than 
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
	
	// i rewrote this code from programcreek changed about 12 things but still their template
	public static ImageIcon[] RandomizeArray(ImageIcon[] ic_logoarr){
		Random rgen = new Random();  // Random number generator			
 
		for (int i=0; i<ic_logoarr.length; i++) {
		    int randomPosition = rgen.nextInt(ic_logoarr.length);
		    ImageIcon ic_logoTemp = ic_logoarr[i];
		    ic_logoarr[i] = ic_logoarr[randomPosition];
		    ic_logoarr[randomPosition] = ic_logoTemp;
		}
 
		return ic_logoarr;
	}
	// i rewrote this code from programcreek

}
