package version1;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonDataClass {
	
	// think easiest solution is static list for each
	private static int flipCounter=0;
	
	

	private static int ButtonNameInc;
	private String ButtonName;
	private static final String imageName = "images/qmark.jpg";
	private String imageHandle; // string file name
	private String path;
	

	private ImageIcon ic_reg; // image
	private ImageIcon ic_logo; // icon resize
	private JButton imageButtons; // not sure if the class should store a JButton; we will see
	private ImageIcon ic_regQue; // question mark image
	private ImageIcon ic_logoQue;
	private boolean isVisible;
	private boolean isMatched;
	static boolean[] isMatchedList = new boolean[36]; // not using yet
	private int imageID = 0;
	

	public ButtonDataClass(String imageHandle) {
		this.path = null;
		ButtonNameInc++;
		this.ButtonName = "Button" + Integer.toString(ButtonNameInc);
		this.imageHandle = imageHandle;
		this.ic_reg = new ImageIcon(imageHandle);
		this.ic_logo = new ImageIcon(((Image) ic_reg.getImage()).getScaledInstance(100, 100, Image.SCALE_FAST));
		this.ic_regQue = new ImageIcon(imageName);
		this.ic_logoQue = new ImageIcon(((Image) ic_regQue.getImage()).getScaledInstance(100, 100, Image.SCALE_FAST));
		this.isVisible = false;
		//this.imageButtons = new JButton(ic_logo);
		this.imageButtons = new JButton(ic_logoQue);
	}
	
	public ButtonDataClass(String path, String imageHandle) {
		ButtonNameInc++;
		this.path = path;
		this.ButtonName = "Button" + Integer.toString(ButtonNameInc);
		this.imageHandle = imageHandle;
		this.ic_reg = new ImageIcon(imageHandle);
		this.ic_logo = new ImageIcon(((Image) ic_reg.getImage()).getScaledInstance(100, 100, Image.SCALE_FAST));
		this.ic_regQue = new ImageIcon(imageName);
		this.ic_logoQue = new ImageIcon(((Image) ic_regQue.getImage()).getScaledInstance(100, 100, Image.SCALE_FAST));
		this.isVisible = false;
		//this.imageButtons = new JButton(ic_logo);
		this.imageButtons = new JButton(ic_logoQue);
	}
	
	public static int getFlipCounter() {
		return flipCounter;
	}
	
	public int getImageID() {
		return imageID;
	}

	public void setImageID(int imageID) {
		this.imageID = imageID;
	}
	
	public String getImageHandle() {
		return imageHandle;
	}

	public void setImageHandle(String imageHandle) {
		this.imageHandle = imageHandle;
	}

	public String getButtonName() {
		return ButtonName;
	}

	public ImageIcon getIc_reg() {
		return ic_reg;
	}

	public void setIc_reg(ImageIcon ic_reg) {
		this.ic_reg = ic_reg;
	}
	
	public boolean isMatched() {
		return isMatched;
	}

	public void setMatched(boolean isMatched) {
		this.isMatched = isMatched;
	}

	public boolean isVisible() {
		if(isVisible == true)
		{
			imageButtons.setIcon(ic_logo);
		}
		else
		{
			imageButtons.setIcon(ic_logoQue);
		}
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		
		if(isMatched() != true) { // make sure this works correctly
		if(isVisible == true)
		{
			imageButtons.setIcon(ic_logo);
		}
		else
		{
			imageButtons.setIcon(ic_logoQue);
		}
		this.isVisible = isVisible;
	}}
	
	public void flipCards() {
		if(flipCounter == 0 || flipCounter == 1 ) {
			if(isVisible != true) {
			flipCounter++;
			setVisible(true);}
		}
	}
	
	// just pass in an array and a position and then you have a match G!!!
	public static void isMatchChecker(ButtonDataClass[] Obj1, int pos1, int pos2) {
		
		if(pos1 != pos2)
		{
		if(pos1 != -2 && pos2 != -2)
		{
		if(Obj1[pos1].equals(Obj1[pos2]))
		{
			Obj1[pos1].setMatched(true);
			Obj1[pos2].setMatched(true);
			System.out.println("Comparison worked!");
		}
		
		}
		}
		
	}
	
	public static void continueClicked() { // pass in an object so it knows which cards to flip back?
		if(flipCounter == 2) {
			flipCounter = 0;
		} // think you can just set all of them to change but the ones that that are matched true won't
		// this might have to be in the same place as the button
	}

	public JButton getImageButtons() {
		return imageButtons;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof ButtonDataClass)
		{
			ButtonDataClass OtherObj = (ButtonDataClass)o;
			if(this.imageID == OtherObj.imageID) // hmm looks like it was done correctly
			{
				return true;
			}
		}
		return false;
		
	}

}
