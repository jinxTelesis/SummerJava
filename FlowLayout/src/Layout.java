import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Layout extends JFrame {
	
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	
	private Container container;
	
	public Layout() {
		super("the title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		// left stuff in here
		lb = new JButton("left ");
		add(lb);
		lb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
			);
		// center button
		cb = new JButton("pizza ");
		add(cb);
		cb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
			);
		// center button
		rb = new JButton("right ");
		add(rb);
		rb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
			);
	}

}
