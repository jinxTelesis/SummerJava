package version1;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonDataClass {
	
	private static int ButtonNameInc;
	private String ButtonName;
	private static final String imageName = "images/qmark.jpg";
	private String imageHandle; // string file name
	private ImageIcon ic_reg; // image
	private ImageIcon ic_logo; // icon resize
	private JButton imageButtons; // not sure if the class should store a JButton; we will see
	private ImageIcon ic_regQue; // question mark image
	private ImageIcon ic_logoQue;
	private boolean isVisible;
	
	public ButtonDataClass(String imageHandle) {
		this.imageHandle = imageHandle;
		this.ic_reg = new ImageIcon(imageHandle);
		this.ic_logo = new ImageIcon(((Image) ic_reg.getImage()).getScaledInstance(100, 100, Image.SCALE_FAST));
		this.ic_regQue = new ImageIcon(imageName);
		this.ic_logoQue = new ImageIcon(((Image) ic_regQue.getImage()).getScaledInstance(100, 100, Image.SCALE_FAST));
		this.isVisible = false;
		this.imageButtons = new JButton(ic_logo);
		//this.imageButtons = new JButton(ic_regQue);
	}

	public ImageIcon getIc_reg() {
		return ic_reg;
	}

	public void setIc_reg(ImageIcon ic_reg) {
		this.ic_reg = ic_reg;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public JButton getImageButtons() {
		return imageButtons;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof ButtonDataClass)
		{
			ButtonDataClass OtherObj = (ButtonDataClass)o;
			if(this.imageHandle.equals(OtherObj.imageHandle))
			{
				return true;
			}
		}
		return false;
		
	}
}
// test equal if the image name is equal
// don't need a to string or a compare