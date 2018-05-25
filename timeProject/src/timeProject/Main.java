package timeProject;
import java.util.EnumSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		fatty bucky = new fatty();
		Food fo = new Food();
		potpie pie = new potpie();
		tuna tunababy = new tuna();
		
		bucky.digest(pie);
		bucky.digest(tunababy);
		bucky.digest(pie);
		
	}
}
