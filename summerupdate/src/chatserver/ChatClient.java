package chatserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame{
	
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String serverIP;
	private Socket connection;
	private String message;
	
	//constructor
	public ChatClient(String host){
		super("Client dude");
		serverIP = host;
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event){
						sendData(event.getActionCommand());
					userText.setText("");
					
					}
	     	}
		);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow), BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);
	}
	
	public void startRunning() {
		try {
			connectToServer();
			setupStreams();
			whileChatting();		}
		catch (EOFException eofException) {
			showMessage("\n Client terminated connection");
		}
		catch(IOException ioException) {
		ioException.printStackTrace();
		}finally {
			closeCrap();
		}
	}
	
	

	private void connectToServer() throws IOException{
		showMessage("Attempting connection... \n");
		connection = new Socket(InetAddress.getByName(serverIP), 6789);
		showMessage("Connected to: " + connection.getInetAddress());
	}
	
	private void setupStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Dude your streams are now good to go!\n");
		
	}
	
	//
	private void whileChatting() throws IOException{
		ableToType(true);
		do {
			try {//string cast of the object
				message = (String) input.readObject();
				showMessage("\n" + message);
			}
			catch(ClassNotFoundException classNotfoundException) {
				showMessage("\n I don't know that object type");
			}
			
			
		}while(!message.equals("SERVER - END"));
	}
	
	//close the streams and sockets
	private void closeCrap() {
		showMessage("\n closing crap down...");
		ableToType(false);
		
		try {
			output.close();
			input.close();
			connection.close();
			
		} catch(IOException ioException) {
			ioException.printStackTrace();
			
		}
	}
	
	// send message to server 
	private void sendMessage(String message) {
		try {
			output.writeObject("CLIENT - " + message);
			output.flush();
			showMessage("\nCLIENT - " + message);
		}
		catch(IOException ioException) {
			chatWindow.append("\n something messed up sending message bud!");
		}
		
		
	}
}
