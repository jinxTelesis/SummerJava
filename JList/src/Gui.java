import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Gui extends JFrame{

	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;
	private static String[] food = {"bacon", "wings","ham","beef","morebacon"};
	
	public Gui() {
		super("title");
		setLayout(new FlowLayout());
		leftlist = new JList(food);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton = new JButton("Move -->");
		movebutton.addActionListener(
				new ActionListener()
				{
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent event)
					{
						rightlist.setListData(leftlist.getSelectedValues());
					}
				}
				
				
		);
		add(movebutton);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	}


}
