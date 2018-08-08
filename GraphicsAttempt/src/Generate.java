import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Generate extends JPanel {
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 500, 300);
		
		g.setColor(new Color(215,81,215));
		g.fillRect(25, 65, 100, 30);
		
		g.setColor(Color.RED);
		g.drawString("this is some text", 25, 120);
		
		g.setColor(Color.BLACK);
		g.drawString("more text", 100, 180);
		
	}

}
