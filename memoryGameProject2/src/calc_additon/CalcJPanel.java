package calc_additon;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class CalcJPanel extends JPanel{// implements ActionListener{

	private JLabel jlDisplay;
	private JP_TextFields jpTf;
	private JP_Buttons jpBtn;
//	private JButton jbAdd, jbSub;
	public static final String ADD = "Add";
	public static final String SUB = "Sub";
	public static final String MULT = "Mult";
	public static final String DIV = "Div";
	enum BtnFaces  {ADD, SUB, MULT, DIV;}
	private static final int NUM_COLUMNS = 10;
	
	public CalcJPanel(){
		setLayout(new GridLayout(3,1));
		jlDisplay = new JLabel("Add or Subtract Below");
//		jlDisplay.setForeground(Color.RED);
//		jlDisplay.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		jlDisplay.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		jlDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		add(jlDisplay);
	

		jpTf = new JP_TextFields();//jpanel with textfields
		jpBtn = new JP_Buttons();//jpanel with buttons

		add(jpTf);//jpanel with textfields
		add(jpBtn);
		
		
	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		//get the nums from jtf1 and jtf2
//		int num1 = getIntFromTextField(jpTf.jtfs[0]);
//		int num2 = getIntFromTextField(jpTf.jtfs[1]);
////		
//		//USE     e.getSource();  //to decide.... or 
//		//USE     e.getActionCommand()  //to decide
//		String cmd = e.getActionCommand();
//	//	JButton cmd = (JButton)e.getSource();
//		String operator = "";
//		int result;
//		//calculate using the nums from jtf1 and jtf2
//	switch(cmd){
//	case ADD:
//		result = num1 + num2; //Math.addExact(num1, num2);
//		operator = " + ";
//		break;
//	case SUB:
//		result = num1 - num2; 
//		operator = " - ";
//		break;
//	default:
//		result = Integer.MIN_VALUE;
//		operator = "bicycles";
//		break;
//	}
//	
////		if(cmd.equals(jbAdd)){
////			result = num1 + num2; //Math.addExact(num1, num2);
////			operator = " + ";
////		}
////		else if(cmd.equals(jbSub)){
////			result = num1 - num2; 
////			operator = " - ";
////		}
////		else{
////			result = Integer.MIN_VALUE;
////			operator = "bicycles";
////		}
//		
//		//display the result
//		jlDisplay.setText(num1 + operator + num2 + " = " + result);
//	}
//	
	public int getIntFromTextField(JTextField jtf){
		return Integer.parseInt(jtf.getText());//assuming user always enters a number
	}
	
	//nested class for textfields
	private class JP_TextFields extends JPanel{
		private JTextField  [] jtfs= new JTextField [2];
		private JP_TextFields(){
			setLayout(new GridLayout(1,2));
			jtfs[0] = new JTextField("Enter a num", NUM_COLUMNS);
			jtfs[1] = new JTextField("Enter a num", NUM_COLUMNS);

			add(jtfs[0]);
			add(jtfs[1]);
		}
	}
	
	
	//nested class for jbuttons
		private class JP_Buttons extends JPanel{
			
			private final int NUM_BUTTONS = 4;
			private JButton  [] jbtns= new JButton [NUM_BUTTONS];
			private String  [] faces= {ADD, SUB, MULT, DIV};
			
			private JP_Buttons(){
				setLayout(new GridLayout(1,NUM_BUTTONS));
				for(int i=0; i<NUM_BUTTONS; i++){
					jbtns[i] = new JButton(faces[i]);
					jbtns[i].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							//get the nums from jtf1 and jtf2
							int num1 = getIntFromTextField(jpTf.jtfs[0]);
							int num2 = getIntFromTextField(jpTf.jtfs[1]);
							String cmd = e.getActionCommand();
							String operator = "";
							int result;
							//calculate using the nums from jtf1 and jtf2
						switch(cmd){
						case ADD:
							result = num1 + num2; //Math.addExact(num1, num2);
							operator = " + ";
							break;
						case SUB:
							result = num1 - num2; 
							operator = " - ";
							break;
						default:
							result = Integer.MIN_VALUE;
							operator = "bicycles";
							break;
						}
							
							//display the result
							jlDisplay.setText(num1 + operator + num2 + " = " + result);
						}
					});
					add(jbtns[i]);
				}
			}
		}
	
	
}