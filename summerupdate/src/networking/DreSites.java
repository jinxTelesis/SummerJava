package networking;

import java.applet.AppletContext;
import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DreSites extends JApplet {
	
	private HashMap<String, URL> websiteInfo;
	private HashMap<String, URL> blahblah;
	private HashMap<String, String> boop;
	private HashMap<String, HashMap> moop;
	
	private ArrayList<String> titles;
	private JList mainList;
	
	//init
	public void init() {
		websiteInfo = new HashMap<String, URL>();
		titles = new ArrayList<String>();
		
		grabHTMLInfo();
		add(new JLabel("What website do you want to vist?"), BorderLayout.NORTH);
		mainList = new JList(titles.toArray());
		
		mainList.addListSelectionListener(
				// anoyomus inner class
				new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent event) {
						Object object = mainList.getSelectedValue();
						URL newDocument = websiteInfo.get(object);
						AppletContext browser = getAppletContext();
						browser.showDocument(newDocument);
					}
					
				}
				);
		
	}

	private void grabHTMLInfo() {
		String title;
		String address;
		URL url; // url object
		int counter = 0;
		title = getParameter("title" + counter);
		
		while(title != null) {
			address = getParameter("address" + counter);
			// hashmap only stores URLs
			try {
				url = new URL(address);
				websiteInfo.put(title, url);
				titles.add(title);
			}
			catch(MalformedURLException urlException) {
				urlException.printStackTrace();
			}
			++counter;
			title = getParameter("title"+counter);
		}
		
	}
	

}
