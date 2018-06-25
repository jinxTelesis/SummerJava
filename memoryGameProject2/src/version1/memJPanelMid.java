package version1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

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
	private double score = 0;
	private int avoidDoubleClick = -1;
	private int avoidTripleCLick = -1;
	private int flipCounter = 0;
	
	
	private JLabel jlAttempts;
	private JLabel jlMatchCou;
	private JLabel jlScore;
	// add in numbers to update in jpanel base
	private String laAttemptStr = "Attempts : "; 
	private String laMatchCouStr = "Matches Found : ";
	private String laScoreStr = "Score : ";
	
	/////////////////////////////////////////////
	Border blackline, raisedetched, loweredetched,
	raisedbevel, loweredbevel, empty;
	
	
	private JButton continueBut;
	private JButton exitBut;
	private JLabel spacer, spacer1, spacer2, spacer3, spacer4;
	private JLabel upSpacer1, upSpacer2, upSpacer3;
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


	private JButton[] imageButtons;
	private ButtonDataClass[] buttonsData = new ButtonDataClass[36];
	private static Queue<Integer> lastClicked = new LinkedList<>();
	
	
	
	
	public memJPanelMid() {//C:\Users\dremo\eclipse-workspace
		if(lastClicked.size() < 2)
		{
			lastClicked.add(-2);
			lastClicked.add(-2);
		}
		
//		try {
//			readFile("images/topScore.txt");
//		} catch (FileNotFoundException e) {
//			System.out.println("Creating a top player file none found ");
//			writeToNewFile("images/topscore.txt", "0", "Nobody");
//		} 
//		
		
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		upSpacer1 = new JLabel(" ");
		upSpacer2 = new JLabel(" ");
		upSpacer3 = new JLabel(" ");
		
		nestedJP1 = new JPanel();
		FlowLayout flowLayObj2 = new FlowLayout(0,105, 35);
		GridLayout GridLayObj = new GridLayout(7,6);
		FlowLayout flowLayObjforUpper = new FlowLayout(0,115, 10);
		nestedJP2 = new JPanel();
		//nestedJP3 = new JPanel();
		
		jlAttempts = new JLabel("             " + laAttemptStr + attempts);
		jlMatchCou = new JLabel("             " + laMatchCouStr + matches);
		jlScore = new JLabel("              "+ laScoreStr + score);
		
		jlAttempts.setAlignmentX(LEFT_ALIGNMENT);
		jlAttempts.setBorder(raisedetched);
		
		jlMatchCou.setAlignmentX(CENTER_ALIGNMENT);
		jlMatchCou.setBorder(raisedetched);
		
		jlScore.setAlignmentX(RIGHT_ALIGNMENT);
		jlScore.setBorder(raisedetched);
		
		nestedJP2.setLayout(flowLayObj2);
		nestedJP2.setBorder(raisedbevel);
		nestedJP1.setLayout(GridLayObj);
		
		
		nestedJP1.add(jlAttempts);
		nestedJP1.add(jlMatchCou);
		nestedJP1.add(upSpacer1);
		nestedJP1.add(upSpacer3);
		nestedJP1.add(upSpacer2);
		nestedJP1.add(jlScore);
		
		//add(nestedJP3);
		
		add(nestedJP1);
		add(nestedJP2);
		
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
		
		//buttonsData = RandomizeArray(buttonsData);
		
		
		
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
		
		if(e.getActionCommand() == "Button0"){
			
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(0);
			}
			
		}
		
		
		if(e.getActionCommand() == "Button1"){
			
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(1);
			}
			
		}
		
		if(e.getActionCommand() == "Button2"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(2);
			}
			
		}
		
		if(e.getActionCommand() == "Button3"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(3);
			}
		}
		
		if(e.getActionCommand() == "Button4"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(4);
			}
			
		}
		
		if(e.getActionCommand() == "Button5") {
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(5);
			}
			
		}
		if(e.getActionCommand() == "Button6"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(6);
			}
		}
		
		if(e.getActionCommand() == "Button7"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(7);
			}
			
			
		}
		
		if(e.getActionCommand() == "Button8"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(8);
			}
		}
		
		if(e.getActionCommand() == "Button9"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(9);
			}
			
		}
		
		if(e.getActionCommand() == "Button10"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(10);
			}
			
			
		}
		
		if(e.getActionCommand() == "Button11") {
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(11);
			}
			
			
		}
		
		if(e.getActionCommand() == "Button12"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(12);
			}
			
			
		}
		
		if(e.getActionCommand() == "Button13"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(13);
			}
			
			
		}
		
		if(e.getActionCommand() == "Button14"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(14);
			}
			
		}
		
		if(e.getActionCommand() == "Button15"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(15);
			}
			
		}
		
		if(e.getActionCommand() == "Button16"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(16);
			}
			
		}
		
		if(e.getActionCommand() == "Button17") {
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(17);
			}
			
		}
		if(e.getActionCommand() == "Button18"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(18);
			}
			
		}
		
		if(e.getActionCommand() == "Button19"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(19);
			}
			
		}
		
		if(e.getActionCommand() == "Button20"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(20);
			}
			
		}
		
		if(e.getActionCommand() == "Button21"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(21);
			}
			
		}
		
		if(e.getActionCommand() == "Button22"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(22);
			}
			
		}
		
		if(e.getActionCommand() == "Button23") {
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(23);
			}
			
		}
		
		if(e.getActionCommand() == "Button24"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(24);
			}
			
		}
		
		if(e.getActionCommand() == "Button25"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(25);
			}
			
		}
		
		if(e.getActionCommand() == "Button26"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(26);
			}
			
		}
		
		if(e.getActionCommand() == "Button27") {
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(27);
			}
			
		}
		if(e.getActionCommand() == "Button28"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(28);
			}
			
		}
		
		if(e.getActionCommand() == "Button29"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(29);
			}
			
		}
		
		if(e.getActionCommand() == "Button30"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(30);
			}
			
		}
		
		if(e.getActionCommand() == "Button31"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(31);
			}
			
			
		}
		
		if(e.getActionCommand() == "Button32"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(32);
			}
			
		}
		
		if(e.getActionCommand() == "Button33") {
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(33);
			}
			
		}
		
		if(e.getActionCommand() == "Button34"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(34);
			}
			
		}
		
		if(e.getActionCommand() == "Button35"){
			if(ButtonDataClass.getFlipCounter() == 0 || ButtonDataClass.getFlipCounter() == 1 )
			{
				buttonLogic(35);
			}
			
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
					attempts += 1;
					jlAttempts.setText("             " + laAttemptStr + attempts);
					ButtonDataClass.isMatchChecker(buttonsData,firPos,secPos);
					
					if(firPos != secPos)
					{
						if(buttonsData[firPos].isMatched())
						{
							if(buttonsData[secPos].isMatched())
							{
								matches = matches + 1;
								laMatchCouStr = "             "  + "Matches Found : " + matches;
								jlMatchCou.setText(laMatchCouStr);
								
								
							}
						}
					}
					
					if(matches == 5) // reset to 18 after 
					{ //"images/topScore.txt"
						Scanner inStream = null;
						String tempScore = "";
						String tempName = "";
						
						try 
						{
							inStream = new Scanner(new File("images/topScore.txt"));
							tempScore = inStream.nextLine();
							tempName = inStream.nextLine();
							System.out.println("this is temp score read from file " + tempScore);
							System.out.println("this is tempName read from a file " + tempName);
						}
						catch(FileNotFoundException e3)
						{
							
							e3.printStackTrace();
							System.err.println("Check permissionsand file name + path "
							+ e3.getMessage());
						}
						
						int highScore = Integer.valueOf(tempScore);
						System.out.println(highScore);
						
						JFrame frame = new JFrame();
						score = ((double)matches/(double)attempts) * 100;
						if (highScore < score)
						{
							tempScore = Double.toString(score);
							PrintWriter outStream = null;
							String test1= JOptionPane.showInputDialog("Game over! Your score was : " + String.format( "%.2f", score) + 
									"\n Enter your name ");
							JOptionPane.showMessageDialog(null, "You are the new leader! with " + String.format( "%.2f", score) + "points");
							
							try {
								
								if(test1 == null)
								{
									test1 = tempName;
								}
								
								FileOutputStream fOut = new FileOutputStream("images/topScore.txt", false);
								outStream = new PrintWriter(fOut);
								outStream.println(tempScore); // add
								outStream.println(test1);
							} catch (FileNotFoundException ERRorevent) {
								
							}
							finally {
								if(outStream != null) {
									outStream.close();
								}
							}
							
							// put exit and score dialog box here
							if(score > 97)
							{
								//Amazing
								JOptionPane.showMessageDialog(null, "BTW you did Amazing!!! Congrats");
								System.exit(0);
							}
							else if(score > 80)
							{
								// Excellent
								JOptionPane.showMessageDialog(null, "BTW you did Excellent!!! Congrats");
								System.exit(0);
							}
							else if(score > 60)
							{
								// OK
								JOptionPane.showMessageDialog(null, "BTW you did OK! Better luck next time");
								System.exit(0);
							}
							else if(score > 30)
							{
								JOptionPane.showMessageDialog(null, "Your score was okay! Better luck next time");
								System.exit(0);
							}
							else if(score > 10)
							{
								JOptionPane.showMessageDialog(null, "Your memory is suffering! Maybe you should get checked out");
								System.exit(0);
							}
							else if(score >= 0)
							{
								JOptionPane.showMessageDialog(null, "Your mind has escaped you, uhh yeah.");
								System.exit(0);
							}
							
						}
						else 
						{
							
							JOptionPane.showMessageDialog(null,"Game over! Your score was : " + String.format( "%.2f", score));
							JOptionPane.showMessageDialog(null, "The leader is " + tempName + " with "  + highScore + "points ");
							
							if(score > 97)
							{
								//Amazing
								JOptionPane.showMessageDialog(null, "BTW you did Amazing!!! Congrats");
								System.exit(0);
							}
							else if(score > 80)
							{
								// Excellent
								JOptionPane.showMessageDialog(null, "BTW you did Excellent!!! Congrats");
								System.exit(0);
							}
							else if(score > 60)
							{
								// OK
								JOptionPane.showMessageDialog(null, "BTW you did OK! Better luck next time");
								System.exit(0);
							}
							else if(score > 30)
							{
								JOptionPane.showMessageDialog(null, "Your score was okay! Better luck next time");
								System.exit(0);
							}
							else if(score > 10)
							{
								JOptionPane.showMessageDialog(null, "Your memory is suffering! Maybe you should get checked out");
								System.exit(0);
							}
							else if(score >= 0)
							{
								JOptionPane.showMessageDialog(null, "Your mind has escaped you, uhh yeah.");
								System.exit(0);
							}

						}
						
//						String test1= JOptionPane.showInputDialog("Game over! Your score was : " + String.format( "%.2f", score) + 
//								"\n Enter your name ");
//						if (highScore < score)
//						{
//							JOptionPane.showInputDialog(" The record holder is " + "Name Variable " + " with: " + highScore + " points ");
//						}
					
						
					}
					
				}
				
				if(matches == 0)
				{
					score = 0;
				}
				else if(matches > 0)
				{
					
					score = ((double)matches/(double)attempts) * 100;
					String temp = String.format( "%.2f", score);
					
					laScoreStr = "              " + "Score : " + temp;
					jlScore.setText(laScoreStr);
				}
				
		

				System.out.println("event worked" + firPos + " " + secPos);
				// the size of last clicked got bigger 
				
				for(int i = 0; i < 36;i++)
				{
					buttonsData[i].setVisible(false);
				}
				
				
				break;
				
			case EXIT:
				
				score = ((double)matches/(double)attempts) * 100;

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
							JOptionPane.showMessageDialog(null, "Your score was " + score);
							if(score > 97)
							{
								//Amazing
								JOptionPane.showMessageDialog(null, "BTW you did Amazing!!! Congrats");
								System.exit(0);
							}
							else if(score > 80)
							{
								// Excellent
								JOptionPane.showMessageDialog(null, "BTW you did Excellent!!! Congrats");
								System.exit(0);
							}
							else if(score > 60)
							{
								// OK
								JOptionPane.showMessageDialog(null, "BTW you did OK! Better luck next time");
								System.exit(0);
							}
							else if(score > 30)
							{
								JOptionPane.showMessageDialog(null, "Your score was okay! Better luck next time");
								System.exit(0);
							}
							else if(score > 10)
							{
								JOptionPane.showMessageDialog(null, "Your memory is suffering! Maybe you should get checked out");
								System.exit(0);
							}
							else if(score >= 0)
							{
								JOptionPane.showMessageDialog(null, "Your mind has escaped you, uhh yeah.");
								System.exit(0);
							}
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
	


	private void buttonLogic(int butClicked) {
		int pollIt =0;
		
		if(avoidDoubleClick == butClicked) {}
		else {
		avoidDoubleClick = butClicked;
		buttonsData[butClicked].flipCards();
		lastClicked.add(butClicked);
		pollIt = lastClicked.poll();
		System.out.println(pollIt);
		}
		
	}

	// i rewrote this code from programcreek changed about 12 things but still their template
	public static ButtonDataClass[] RandomizeArray(ButtonDataClass[] ic_logoarr){
		Random rgen = new Random();  // Random number generator			
 
		for (int i=0; i<ic_logoarr.length; i++) {
		    int randomPosition = rgen.nextInt(ic_logoarr.length);
		    ButtonDataClass ic_logoTemp = ic_logoarr[i];
		    ic_logoarr[i] = ic_logoarr[randomPosition];
		    ic_logoarr[randomPosition] = ic_logoTemp;
		}
 
		return ic_logoarr;
	}
	// i rewrote this code from programcreek
	
	// this is your file handler you wrote in class, although ive written at least 100 in other languages
	public String readFile(String fileName) throws FileNotFoundException{
		String text = "";
		Scanner inStream = null;
		
		try {
			inStream = new Scanner(new File(fileName));
			int lineNum = 0;
			while(inStream.hasNextLine()) {
				text += inStream.nextLine();
			}
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
			System.err.println("Check permissionsand file name + path "
			+ e.getMessage());
			throw e;
		}
		finally {
			if(inStream !=null) {
				inStream.close();
			}
			
		}
		return text;
	}

	public void writeToNewFile(String fileName, String text1, String text2) {
		PrintWriter outStream = null;
		try {
			outStream = new PrintWriter(fileName);//create&connect to file
			outStream.println(text1);//write 1 line to the file
			outStream.println(text2);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Check your permissions and path or file name. Exception "+e.getMessage());
		}
		finally{
			if(outStream!=null){
				outStream.close();
				System.out.println("ALL DONE");
			}
		}
	}
	

}
