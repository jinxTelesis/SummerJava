package chatserver;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server extends JFrame{
	
	private JTextField userText;
	private JTextArea chatWindow;
	// hmm object output stream does???
	// this is the ip 
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;

}
