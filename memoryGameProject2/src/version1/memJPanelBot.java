package version1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;



public class memJPanelBot extends JPanel implements ActionListener {
	
	Border blackline, raisedetched, loweredetched,
	raisedbevel, loweredbevel, empty;
	private JButton continueBut;
	private JButton exitBut;
	private JLabel spacer, spacer1, spacer2, spacer3, spacer4;
	
	public static final String EXIT = "Exit";
	public static final String CONTINUE = "Continue";
	
	public memJPanelBot() {
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
		
		add(spacer);
		add(spacer1);
		add(spacer4);
		add(continueBut);
		add(spacer2);
		add(spacer3);
		add(exitBut);
		
		
		continueBut.addActionListener(this);
		exitBut.addActionListener(this);
		
		
		
	}

	@Override //e.getActionCommand() == Actions.Button00.name()
	public void actionPerformed(ActionEvent e) {
		String cmd;
		cmd = e.getActionCommand();
		
		switch(cmd) {
		
			case CONTINUE:
				
				
				
				break;
				
				
			case EXIT:
				
				//showConfirmDialog(null,"Would you like to exit?")
				
				javax.swing.SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						JOptionPane joption = new JOptionPane();
						ExitJFrame frame = new ExitJFrame();
						frame.setVisible(false);
						//frame.setSize(300,240);
						//frame.pack();
						//frame.setResizable(false);
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

}
