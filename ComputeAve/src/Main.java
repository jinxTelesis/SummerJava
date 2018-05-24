import java.io.*;

public class Main {

	public static void main(String[] args) {
		String str;
		double number;
		double total;
		double avg;
		int count;
		total = 0;
		count = 0;
		System.out.println("enter your numbers, press return to end.");
		while(true) {
			System.out.print("?");
			str = TextIO.getln();
			if (str.equals(""))
			{
				break;
			}
			try {
				number = Double.parseDouble(str);
				total = total + number;
				count = count +1;
				
			}
			catch (Exception e) {
				System.out.println("Not a legal number! Try again.");
			}
		}
		avg = total/count;
		System.out.printf("The average of %d numbers is %1.6%n", count, avg);

	}

}
