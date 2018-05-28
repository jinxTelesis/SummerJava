import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Gui extends JFrame {
	private String details;
	private JLabel statusbar;
	
	public Gui() {
		super("tutle");
		
		statusbar = new JLabel("this is default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
		
	}
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent event) {
			details = String.format("You clicked %d ", event.getClickCount());
			
			if(event.isMetaDown())
				details += "with right mouse button";
			else if (event.isAltDown())
				details += "either center mouse button";
			else
				details += "with left mouse button";
			
			statusbar.setText(details);
		}
	}
}