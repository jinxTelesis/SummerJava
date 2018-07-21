package gui_int;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login {

	private JFrame frame;
	private JTextField UserNameTxtF;
	private JPasswordField passTF;
	


	public static void main(String[] args) {
		
	    try {
	        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	    } catch(Exception e) {
	        System.out.println("Error setting native LAF: " + e);
	    }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(64, 51, 71, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setLabelFor(frame);
		lblPassword.setBounds(64, 96, 71, 27);
		frame.getContentPane().add(lblPassword);
		
		UserNameTxtF = new JTextField();
		
		UserNameTxtF.setBounds(145, 54, 137, 25);
		frame.getContentPane().add(UserNameTxtF);
		UserNameTxtF.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.setBounds(64, 146, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Register");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExit.setBounds(193, 146, 89, 23);
		frame.getContentPane().add(btnExit);
		
		passTF = new JPasswordField();
		passTF.setBounds(145, 99, 137, 25);
		frame.getContentPane().add(passTF);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userName = UserNameTxtF.getText();
				String userPass = passTF.getText();
				
			if(userName.equals("Billy") && userPass.equals("Bob")) {
				System.out.println("Worked");
			}
				
				
			}
		});
		
	
	}
}
