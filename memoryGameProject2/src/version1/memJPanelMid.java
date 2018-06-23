package version1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;



// need to build her special constructor

// make a static method that takes object for card flips
// add matched to logic and class

public class memJPanelMid extends JPanel implements ActionListener {
	
	public static final String EXIT = "Exit";
	public static final String CONTINUE = "Continue";
	

	
	/////////////////////////////////////////////
	Border blackline, raisedetched, loweredetched,
	raisedbevel, loweredbevel, empty;
	
	
	private JButton continueBut;
	private JButton exitBut;
	private JLabel spacer, spacer1, spacer2, spacer3, spacer4;
	private JPanel nestedJP1;
	private JPanel nestedJP2;

	
	///////////////////////////////////////
	
	private enum Actions{
		Button0,Button1,Button2,Button3,Button4,Button5,
		Button6,Button7,Button8,Button9,Button10,Button11,
		Button12,Button13,Button14,Button15,Button16,Button17,
		Button18,Button19,Button20,Button21,Button22,Button23,
		Button24,Button25,Button26,Button27,Button28,Button29,
		Button30,Button31,Button32,Button33,Button34,Button35;	
	}
	
	private boolean[] isMatched = new boolean[36]; //

	
	
//	private ImageIcon[] ic_reg = new ImageIcon[36]; 
//	private ImageIcon[] ic_logo = new ImageIcon[36];
//	private JButton test1;
//	private ImageIcon ic_regQue;
//	private ImageIcon ic_logoQue;
	
	private JButton[] imageButtons;
	private ButtonDataClass[] buttonsData = new ButtonDataClass[36];
	private static Queue<Integer> lastClicked = new LinkedList<>();
	
	public memJPanelMid() {//C:\Users\dremo\eclipse-workspace
		lastClicked.add(-1);
		lastClicked.add(-1);
		
		
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		nestedJP1 = new JPanel();
		FlowLayout flowLayObj2 = new FlowLayout(0,105, 35);
		GridLayout GridLayObj = new GridLayout(6,6);
		nestedJP2 = new JPanel();
		add(nestedJP1);
		add(nestedJP2);
		nestedJP2.setLayout(flowLayObj2);
		nestedJP2.setBorder(raisedbevel);
		nestedJP1.setLayout(GridLayObj);
		
		
		
		for(int i = 0; i < 36; i++) // hmm worked
		{
			buttonsData[i] = new ButtonDataClass("images/image" + Integer.toString(i) + ".jpg");
		}
		// test
		
		
		// test 
		imageButtons = new JButton[36];
		
		for(int i = 0; i < 36; i++) {
			
			nestedJP1.add(buttonsData[i].getImageButtons());
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
		
		
		// this was part of bottom class but needed to change program structure
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		spacer = new JLabel(" ");
		spacer1 = new JLabel("");
		spacer2 = new JLabel(" ");
		spacer3 = new JLabel("");
		spacer4 = new JLabel(" ");
		
		
		
		continueBut = new JButton(CONTINUE);
		exitBut = new JButton(EXIT);
		
		spacer.setAlignmentX(LEFT_ALIGNMENT);
		continueBut.setAlignmentX(CENTER_ALIGNMENT);
		continueBut.setPreferredSize(new Dimension(125,40));
		
		continueBut.setBorder(raisedetched);
		exitBut.setAlignmentX(LEFT_ALIGNMENT);
		exitBut.setBorder(raisedetched);
		exitBut.setPreferredSize(new Dimension(80,40));
		
		nestedJP2.add(spacer);
		nestedJP2.add(spacer1);
		nestedJP2.add(spacer4);
		nestedJP2.add(continueBut);
		nestedJP2.add(spacer2);
		nestedJP2.add(spacer3);
		nestedJP2.add(exitBut);		
		
		continueBut.addActionListener(this); //i need to add these to other class though
		exitBut.addActionListener(this);
		
		
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
	
	
	
	@Override // should do enumerations for this easier than // could save last object clicked
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getActionCommand() == "Button0"){
			
			buttonsData[0].flipCards();
			lastClicked.remove();
			System.out.println(lastClicked.remove());
			lastClicked.add(0);
			
		}
		
		if(e.getActionCommand() == "Button1"){
			
			buttonsData[1].flipCards();
			lastClicked.remove();
			System.out.println(lastClicked.remove());
			lastClicked.add(1);
		}
		
		if(e.getActionCommand() == "Button2"){

			buttonsData[2].flipCards();
			lastClicked.remove();
			System.out.println(lastClicked.remove());
			lastClicked.add(2);
		}
		
		if(e.getActionCommand() == "Button3"){
			buttonsData[3].flipCards();
			
		}
		
		if(e.getActionCommand() == "Button4"){
			buttonsData[4].flipCards();
			
		}
		
		if(e.getActionCommand() == "Button5") {
			buttonsData[5].flipCards();
			
		}
		if(e.getActionCommand() == "Button6"){
			
			buttonsData[6].flipCards();
		}
		
		if(e.getActionCommand() == "Button7"){
			
			buttonsData[7].flipCards();
		}
		
		if(e.getActionCommand() == "Button8"){
			
			buttonsData[8].flipCards();
		}
		
		if(e.getActionCommand() == "Button9"){
			
			buttonsData[9].flipCards();
		}
		
		if(e.getActionCommand() == "Button10"){
			
			buttonsData[10].flipCards();
		}
		
		if(e.getActionCommand() == "Button11") {
			
			buttonsData[11].flipCards();
		}
		
		if(e.getActionCommand() == "Button12"){
			
			buttonsData[12].flipCards();
		}
		
		if(e.getActionCommand() == "Button13"){
			
			buttonsData[13].flipCards();
		}
		
		if(e.getActionCommand() == "Button14"){
			
			buttonsData[14].flipCards();
		}
		
		if(e.getActionCommand() == "Button15"){
			
			buttonsData[15].flipCards();
		}
		
		if(e.getActionCommand() == "Button16"){
			
			buttonsData[16].flipCards();
		}
		
		if(e.getActionCommand() == "Button17") {
			
			buttonsData[17].flipCards();
		}
		if(e.getActionCommand() == "Button18"){
			
			buttonsData[18].flipCards();
		}
		
		if(e.getActionCommand() == "Button19"){
			System.out.println("worked");
			buttonsData[19].flipCards();
		}
		
		if(e.getActionCommand() == "Button20"){
			System.out.println("worked");
			buttonsData[20].flipCards();
		}
		
		if(e.getActionCommand() == "Button21"){
			System.out.println("worked");
			buttonsData[21].flipCards();
		}
		
		if(e.getActionCommand() == "Button22"){
			System.out.println("worked");
			buttonsData[22].flipCards();
		}
		
		if(e.getActionCommand() == "Button23") {
			System.out.println("worked");
			buttonsData[23].flipCards();
		}
		
		if(e.getActionCommand() == "Button24"){
			System.out.println("worked");
			buttonsData[24].flipCards();
		}
		
		if(e.getActionCommand() == "Button25"){
			System.out.println("worked");
			buttonsData[25].flipCards();
		}
		
		if(e.getActionCommand() == "Button26"){
			System.out.println("worked");
			buttonsData[26].flipCards();
		}
		
		if(e.getActionCommand() == "Button27") {
			System.out.println("worked");
			buttonsData[27].flipCards();
		}
		if(e.getActionCommand() == "Button28"){
			System.out.println("worked");
			buttonsData[28].flipCards();
		}
		
		if(e.getActionCommand() == "Button29"){
			System.out.println("worked");
			buttonsData[29].flipCards();
		}
		
		if(e.getActionCommand() == "Button30"){
			System.out.println("worked");
			buttonsData[30].flipCards();
		}
		
		if(e.getActionCommand() == "Button31"){
			System.out.println("worked");
			buttonsData[31].flipCards();
		}
		
		if(e.getActionCommand() == "Button32"){
			System.out.println("worked");
			buttonsData[32].flipCards();
		}
		
		if(e.getActionCommand() == "Button33") {
			System.out.println("worked");
			buttonsData[33].flipCards();
		}
		
		if(e.getActionCommand() == "Button34"){
			System.out.println("worked");
			buttonsData[34].flipCards();
		}
		
		if(e.getActionCommand() == "Button35"){
			System.out.println("worked");
			buttonsData[35].flipCards();
		}

		
		// this is for bottom panel events not mid buttons
		String cmd;
		cmd = e.getActionCommand();
		
		switch(cmd) {
		
			case CONTINUE:
				ButtonDataClass.continueClicked();

				System.out.println("event worked");
				break;
				
			case EXIT:

				javax.swing.SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						JOptionPane joption = new JOptionPane();
						ExitJFrame frame = new ExitJFrame();
						frame.setVisible(false);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						int dialogResult = joption.YES_NO_OPTION;
						dialogResult = joption.showConfirmDialog(null,"Would you like to exit?");
						add(joption);
						if(dialogResult == JOptionPane.YES_OPTION)
						{
							System.exit(0);
						}
						else if(dialogResult == JOptionPane.NO_OPTION)
						{
							frame.dispose();
						}
						else
						{
							frame.dispose();
						}
					}
				});
				break;
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
