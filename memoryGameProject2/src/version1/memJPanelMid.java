package version1;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class memJPanelMid extends JPanel implements ActionListener {
	
	private JButton[] imageButtons;
	private JButton test1;
	
	public memJPanelMid() {
		//C:\Users\dremo\eclipse-workspace
		
		imageButtons = new JButton[36];
		
		for (int i = 0; i < 36; i++) {
			imageButtons[i] = new JButton(Integer.toString(i));
			add(imageButtons[i]);
			imageButtons[i].addActionListener(this);
			imageButtons[i].setPreferredSize(new Dimension(175, 100));
		}
		
		ImageIcon ic_reg = new ImageIcon("images/goth.jpg");
		ImageIcon ic_logo = new ImageIcon(((Image) ic_reg.getImage()).getScaledInstance(70, 70, Image.SCALE_FAST));
		
//		try {
//		    Image img = ImageIO.read(getClass().getResource("resources/water.bmp"));
//		    button.setIcon(new ImageIcon(img));
//		  } catch (Exception ex) {
//		    System.out.println(ex);
//		  }
		
		
		test1 = new JButton();
		add(test1);
		test1.addActionListener(this);
		test1.setPreferredSize(new Dimension(100,100));
		test1.addActionListener(this);
		test1.setIcon(ic_reg);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
