package chatserver;

import javax.swing.JFrame;

public class ServerDriver {

	public static void main(String[] args) {
		Server sally = new Server();
		sally.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sally.startRunning();// starts server

	}

}
