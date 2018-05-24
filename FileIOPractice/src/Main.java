
public class Main {

	public static void main(String[] args) {
		String name;
		String email;
		double salary;
		String favColor;
		
		TextIO.putln("Good Afternoon! This program will create");
		TextIO.putln("your profile file, if you will just answer");
		TextIO.putln("a few simple questions.");
		TextIO.putln();
		
		TextIO.put("What is your name?               ");
		name = TextIO.getln();
		TextIO.put("WHat is your email address? ");
		email = TextIO.getln();
		TextIO.put("What is your yearly income? ");
		salary = TextIO.getlnDouble();
		TextIO.put("Waht is your favorite color? ");
		favColor = TextIO.getln();
		
		TextIO.writeFile("nukeem.txt");
		TextIO.putln("Name:           " + name);
		TextIO.putln("Email:          " + email);
		TextIO.put("Favorite Color:   " + favColor);
		TextIO.putf("Yearly Income: %1.2f%n", salary);
		
		TextIO.writeStandardOutput();
		TextIO.putln("Thank you. Your profile has been written to profile.");

	}

}
