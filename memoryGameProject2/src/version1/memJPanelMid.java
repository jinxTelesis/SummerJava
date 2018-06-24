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
	
	// scores and top panel
	
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
	
	/////////////////////////////////////////////
	Border blackline, raisedetched, loweredetched,
	raisedbevel, loweredbevel, empty;
	
	
	private JButton continueBut;
	private JButton exitBut;
	private JLabel spacer, spacer1, spacer2, spacer3, spacer4;
	private JPanel nestedJP1;
	private JPanel nestedJP2;
	private JPanel nestedJP3;

	
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
		if(lastClicked.size() < 2)
		{
			lastClicked.add(-2);
			lastClicked.add(-2);
		}
		
		
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		nestedJP1 = new JPanel();
		FlowLayout flowLayObj2 = new FlowLayout(0,105, 35);
		GridLayout GridLayObj = new GridLayout(6,6);
		FlowLayout flowLayObjforUpper = new FlowLayout(0,115, 10);
		nestedJP2 = new JPanel();
		nestedJP3 = new JPanel();
		
		add(nestedJP3);
		add(nestedJP1);
		add(nestedJP2);
		
		nestedJP3.setPreferredSize(new Dimension(1100,200));
		nestedJP3.setLayout(flowLayObjforUpper);
		nestedJP3.setBorder(blackline);
		nestedJP2.setLayout(flowLayObj2);
		nestedJP2.setBorder(raisedbevel);
		nestedJP1.setLayout(GridLayObj);
		
		
		
		
		jlAttempts = new JLabel(laAttemptStr + attempts);
		jlMatchCou = new JLabel(laMatchCouStr + matches);
		jlScore = new JLabel(laScoreStr + score);
		
		jlAttempts.setAlignmentX(LEFT_ALIGNMENT);
		jlAttempts.setBorder(raisedetched);
		
		jlMatchCou.setAlignmentX(CENTER_ALIGNMENT);
		jlMatchCou.setBorder(raisedetched);
		
		jlScore.setAlignmentX(RIGHT_ALIGNMENT);
		jlScore.setBorder(raisedetched);
		
		nestedJP3.add(jlAttempts);
		nestedJP3.add(jlMatchCou);
		nestedJP3.add(jlScore);
		
		
		
		
		for(int i = 0; i < 36; i++) // hmm worked
		{
			buttonsData[i] = new ButtonDataClass("images/image" + Integer.toString(i) + ".jpg");
			buttonsData[i].setImageHandle("images/image" + Integer.toString(i) + ".jpg");
			if(i >= 0 && i < 18)
			{
				buttonsData[i].setImageID(i);
			}
			else
			{
				buttonsData[i].setImageID(i - 18);
			}
		}
		
//		for(int i = 0; i < 36; i++) {
//			System.out.println("image name " + buttonsData[i].getImageHandle());
//			System.out.println("Image id " + buttonsData[i].getImageID());
//		}
		
		
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
		int pollIt =0;
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		// check by iterating over both values in a parelle array of sorts
		
		if(e.getActionCommand() == "Button0"){
			
			buttonsData[0].flipCards();
			lastClicked.add(0);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button1"){
			
			buttonsData[1].flipCards();
			lastClicked.add(1);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);

			
		}
		
		if(e.getActionCommand() == "Button2"){

			buttonsData[2].flipCards();
			lastClicked.add(2);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button3"){
			buttonsData[3].flipCards();
			lastClicked.add(3);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button4"){
			buttonsData[4].flipCards();
			lastClicked.add(4);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button5") {
			buttonsData[5].flipCards();
			lastClicked.add(5);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
			
		}
		if(e.getActionCommand() == "Button6"){
			buttonsData[6].flipCards();
			lastClicked.add(6);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);

		}
		
		if(e.getActionCommand() == "Button7"){
			buttonsData[7].flipCards();
			lastClicked.add(7);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button8"){
			buttonsData[8].flipCards();
			lastClicked.add(8);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button9"){
			buttonsData[9].flipCards();
			lastClicked.add(9);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button10"){
			buttonsData[10].flipCards();
			lastClicked.add(10);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button11") {
			buttonsData[11].flipCards();
			lastClicked.add(11);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button12"){
			buttonsData[12].flipCards();
			lastClicked.add(12);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button13"){
			buttonsData[13].flipCards();
			lastClicked.add(13);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);	
			
		}
		
		if(e.getActionCommand() == "Button14"){
			buttonsData[14].flipCards();
			lastClicked.add(14);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button15"){
			buttonsData[15].flipCards();
			lastClicked.add(15);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button16"){
			buttonsData[16].flipCards();
			lastClicked.add(16);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button17") {
			buttonsData[17].flipCards();
			lastClicked.add(17);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		if(e.getActionCommand() == "Button18"){
			buttonsData[18].flipCards();
			lastClicked.add(18);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button19"){
			buttonsData[19].flipCards();
			lastClicked.add(19);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button20"){
			buttonsData[20].flipCards();
			lastClicked.add(20);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button21"){
			buttonsData[21].flipCards();
			lastClicked.add(21);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button22"){
			buttonsData[22].flipCards();
			lastClicked.add(22);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button23") {
			buttonsData[23].flipCards();
			lastClicked.add(23);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button24"){
			buttonsData[24].flipCards();
			lastClicked.add(24);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button25"){
			buttonsData[25].flipCards();
			lastClicked.add(25);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button26"){
			buttonsData[26].flipCards();
			lastClicked.add(26);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button27") {
			buttonsData[27].flipCards();
			lastClicked.add(27);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		if(e.getActionCommand() == "Button28"){
			buttonsData[28].flipCards();
			lastClicked.add(28);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button29"){
			buttonsData[29].flipCards();
			lastClicked.add(29);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button30"){
			buttonsData[30].flipCards();
			lastClicked.add(30);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button31"){
			buttonsData[31].flipCards();
			lastClicked.add(31);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
			
		}
		
		if(e.getActionCommand() == "Button32"){
			buttonsData[32].flipCards();
			lastClicked.add(32);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button33") {
			buttonsData[33].flipCards();
			lastClicked.add(33);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button34"){
			buttonsData[34].flipCards();
			lastClicked.add(34);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}
		
		if(e.getActionCommand() == "Button35"){
			buttonsData[35].flipCards();
			lastClicked.add(35);
			pollIt = lastClicked.poll();
			System.out.println(pollIt);
		}

		
		// this is for bottom panel events not mid buttons
		String cmd;
		cmd = e.getActionCommand();
		int firPos;
		int secPos;
		
		switch(cmd) {
		
			case CONTINUE:
				// card one is mistakenly set to true somewhere
				
				
				
				
				
				ButtonDataClass.continueClicked();
				System.out.println("this is lastClicked size" + lastClicked.size());
				firPos =lastClicked.poll();
				lastClicked.add(-2);
				secPos =lastClicked.poll();
				lastClicked.add(-2);
				if(firPos != -2 && secPos != -2)
				{
					setAttempts(getAttempts() + 1);
				}
				
				
				ButtonDataClass.isMatchChecker(buttonsData,firPos,secPos);
				System.out.println(buttonsData[firPos].isMatched());
				System.out.println(buttonsData[secPos].isMatched());

				System.out.println("event worked" + firPos + " " + secPos);
				// the size of last clicked got bigger 
				
				for(int i = 0; i < 36;i++)
				{
					buttonsData[i].setVisible(false);
				}
				
				
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

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

}
