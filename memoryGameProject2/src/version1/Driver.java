package version1;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				memJFrame frame = new memJFrame();
				frame.setVisible(true);
				frame.setSize(1200,800);
				//frame.pack();
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			}
			
		});
		
		
	}

}
