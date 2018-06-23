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


// need to build her special constructor
// need to test if one card object equals another
// might need to make a card object not just these image arrays


public class memJPanelMid extends JPanel implements ActionListener {
	
	public static final String EXIT = "Exit";
	public static final String CONTINUE = "Continue";
	
	private enum Actions{
		Button0,Button1,Button2,Button3,Button4,Button5,
		Button6,Button7,Button8,Button9,Button10,Button11,
		Button12,Button13,Button14,Button15,Button16,Button17,
		Button18,Button19,Button20,Button21,Button22,Button23,
		Button24,Button25,Button26,Button27,Button28,Button29,
		Button30,Button31,Button32,Button33,Button34,Button35;	
	}
	
	
//	private ImageIcon[] ic_reg = new ImageIcon[36]; 
//	private ImageIcon[] ic_logo = new ImageIcon[36];
//	private JButton test1;
//	private ImageIcon ic_regQue;
//	private ImageIcon ic_logoQue;
	
	private JButton[] imageButtons;
	private ButtonDataClass[] buttonsData = new ButtonDataClass[36];
	
	
	public memJPanelMid() {//C:\Users\dremo\eclipse-workspace
		
		for(int i = 0; i < 36; i++) // hmm worked
		{
			buttonsData[i] = new ButtonDataClass("images/image" + Integer.toString(i) + ".jpg");
		}
		// test
		
		
		// test 
		imageButtons = new JButton[36];
		
		for(int i = 0; i < 36; i++) {
			
			add(buttonsData[i].getImageButtons());
			buttonsData[i].getImageButtons().setPreferredSize(new Dimension(175, 100));
			buttonsData[i].getImageButtons().addActionListener(this);
		}
		
		buttonsData[0].getImageButtons().setActionCommand(Actions.Button0.name());
		buttonsData[1].getImageButtons().setActionCommand(Actions.Button1.name());
		buttonsData[2].getImageButtons().setActionCommand(Actions.Button2.name());
		buttonsData[3].getImageButtons().setActionCommand(Actions.Button3.name());
		buttonsData[4].getImageButtons().setActionCommand(Actions.Button4.name());
		buttonsData[5].getImageButtons().setActionCommand(Actions.Button5.name());
		buttonsData[6].getImageButtons().setActionCommand(Actions.Button6.name());
		buttonsData[7].getImageButtons().setActionCommand(Actions.Button7.name());
		buttonsData[8].getImageButtons().setActionCommand(Actions.Button8.name());
		buttonsData[9].getImageButtons().setActionCommand(Actions.Button9.name());
		buttonsData[10].getImageButtons().setActionCommand(Actions.Button10.name());
		buttonsData[11].getImageButtons().setActionCommand(Actions.Button11.name());
		buttonsData[12].getImageButtons().setActionCommand(Actions.Button12.name());
		buttonsData[13].getImageButtons().setActionCommand(Actions.Button13.name());
		buttonsData[14].getImageButtons().setActionCommand(Actions.Button14.name());
		buttonsData[15].getImageButtons().setActionCommand(Actions.Button15.name());
		buttonsData[16].getImageButtons().setActionCommand(Actions.Button16.name());
		buttonsData[17].getImageButtons().setActionCommand(Actions.Button17.name());
		buttonsData[18].getImageButtons().setActionCommand(Actions.Button18.name());
		buttonsData[19].getImageButtons().setActionCommand(Actions.Button19.name());
		buttonsData[20].getImageButtons().setActionCommand(Actions.Button20.name());
		buttonsData[21].getImageButtons().setActionCommand(Actions.Button21.name());
		buttonsData[22].getImageButtons().setActionCommand(Actions.Button22.name());
		buttonsData[23].getImageButtons().setActionCommand(Actions.Button23.name());
		buttonsData[24].getImageButtons().setActionCommand(Actions.Button24.name());
		buttonsData[25].getImageButtons().setActionCommand(Actions.Button25.name());
		buttonsData[26].getImageButtons().setActionCommand(Actions.Button26.name());
		buttonsData[27].getImageButtons().setActionCommand(Actions.Button27.name());
		buttonsData[28].getImageButtons().setActionCommand(Actions.Button28.name());
		buttonsData[29].getImageButtons().setActionCommand(Actions.Button29.name());
		buttonsData[30].getImageButtons().setActionCommand(Actions.Button30.name());
		buttonsData[31].getImageButtons().setActionCommand(Actions.Button31.name());
		buttonsData[32].getImageButtons().setActionCommand(Actions.Button32.name());
		buttonsData[33].getImageButtons().setActionCommand(Actions.Button33.name());
		buttonsData[34].getImageButtons().setActionCommand(Actions.Button34.name());
		buttonsData[35].getImageButtons().setActionCommand(Actions.Button35.name());
		
		
//		for(int i = 0; i < 36; i++) {
//			System.out.println(buttonsData[i].getButtonName());
//		}
//		
//		for(int i = 0; i < 36; i++) {
//			System.out.println(Actions.Button0.name());
//		}
		
//		ic_regQue = new ImageIcon("images/qmark.jpg"); // the question mark
//		ic_logoQue = new ImageIcon(((Image) ic_regQue.getImage()).getScaledInstance(100, 100, Image.SCALE_FAST)); //the question mark
//		
//		imageButtons = new JButton[36]; 
//		
//		for (int i = 0; i < 36; i++) {
//			ic_reg[i] = new ImageIcon("images/image" + Integer.toString(i) +".jpg");
//			ic_logo[i] = new ImageIcon(((Image) ic_reg[i].getImage()).getScaledInstance(100, 100, Image.SCALE_FAST));
//		}
//		
//		ic_logo = RandomizeArray(ic_logo); // is this valid in java? bad to reorganize an array while using it in python
//		
//		for (int i = 0; i < 36; i++) {
//			imageButtons[i] = new JButton(ic_logo[i]);
//			add(imageButtons[i]);
//			imageButtons[i].setActionCommand(Actions.Button00.name());
//			imageButtons[i].addActionListener(this);
//			imageButtons[i].setPreferredSize(new Dimension(175, 100));
//		}
		
		//hideCard(imageButtons, ic_logoQue);
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
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand() == "Button0"){
			System.out.println("worked");
		}
		
		if(e.getActionCommand() == "Button1"){
			System.out.println("worked");
		}
		
		if(e.getActionCommand() == "Button2"){
			System.out.println("worked");
		}
		
		if(e.getActionCommand() == "Button3"){
			System.out.println("worked");
		}
		
		if(e.getActionCommand() == "Button4"){
			System.out.println("worked");
		}
		
		if(e.getActionCommand() == "Button5") {
			System.out.println("worked");
		}
			
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
