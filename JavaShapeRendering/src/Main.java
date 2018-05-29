import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		int rank = 10;
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ShapeGen R = new ShapeGen();
		R.setBackground(Color.WHITE);
		f.add(R);
		f.setSize(500,270);
		f.setVisible(true);
		

	}

}
