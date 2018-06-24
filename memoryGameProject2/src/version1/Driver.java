package version1;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		
		ButtonDataClass dataObjTest1 = new ButtonDataClass("images/image0.jpg");
		ButtonDataClass dataObjTest2 = new ButtonDataClass("images/image0.jpg");
		ButtonDataClass dataObjTest3 = new ButtonDataClass("images/image1.jpg");
		ButtonDataClass dataObjTest4 = new ButtonDataClass("images/image1.jpg");
		
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
