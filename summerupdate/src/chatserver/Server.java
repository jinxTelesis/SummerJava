package chatserver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Server extends JFrame{
	
	private JTextField userText;
	private JTextArea chatWindow;
	// hmm object output stream does???
	// this is the ip 
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	public Server() {
		super("Dre's Instant Messenger");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}
		);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300,150);
		setVisible(true);
	}
	
	// set up and run the server
	public void startRunning() {
		try {
			server = new ServerSocket(6789, 100);
			while(true) {
				try {
					//connect and have conversation
					waitForConnection();
					setupStreams();
					whileChatting();
				}
				catch(EOFException eofException) {
					showMessage("\n Server ended the connection! ");
				}
				finally {
					closeCrap();
				}
			}
		}
		catch(IOException ioException) {
			ioException.printStackTrace();
		}
		
		
	}

	

	

	private void waitForConnection() throws IOException{
		showMessage(" Waiting for someone to connect.. \n");
		connection = server.accept();
		showMessage(" Now connected to " + connection.getInetAddress().getHostAddress());
		
	}
	
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush(); // how you flush the buffer
		
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are not setup! \n");
	}
	
	private void whileChatting() throws IOException{
		String message =" You are now connected! ";
		sendMessage(message);
		abletoType(true);
		
		do {
			try { // input stream or socket 
				message = (String) input.readObject();
				showMessage("\n " + message);
			}
			catch(ClassNotFoundException classNotFoundException)
			{
				showMessage("\n idk wtf that user sent");
			}
		}while(!message.equals("Client - end"));
	}
	// cleanup after chatting
	private void closeCrap() {
		showMessage("\n Closing connections...");
		abletoType(false);
		try {
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
		
	}
	
	private void sendMessage(String message) {
		try {
			output.writeObject("SERVER -  " + message);
			output.flush();
			showMessage("\nSERVER - " + message);
		}catch(IOException ioException) {
			chatWindow.append("\n ERROR: DUDE I CANT SEND THAT MESSAGE");
		}
	}
	
	//update chatWindow // thread to update gui
	private void showMessage(final String text) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						chatWindow.append(text);
					}
				}
			);
	}
	
	// let the user type stuff into their box
	private void abletoType(final boolean tof) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						userText.setEditable(tof);
					}
				}
		);
	
	}
}