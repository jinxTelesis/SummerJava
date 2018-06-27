package calc_additon;

import javax.swing.JFrame;

public class Show_GUI {

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				CalcJFrame gui = new CalcJFrame();
				gui.setVisible(true);
				//gui.setSize(300, 500);
				gui.pack();
				gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		
		
	}

}
