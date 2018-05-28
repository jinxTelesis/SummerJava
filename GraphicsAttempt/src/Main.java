import javax.swing.JFrame;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
	
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Generate p = new Generate();
		f.add(p);
		f.setSize(400, 250);
		f.setVisible(true);

	}

}
