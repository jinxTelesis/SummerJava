package enumPractice;

enum Season {SPRING, SUMMER, FALL, WINTER}
enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
enum Month {JAN, FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}

public class Main {

	public static void main(String[] args) {
		
		Day tgif;
		Month libra;
		
		tgif = Day.FRIDAY;
		libra = Month.OCT;
		
		System.out.println(libra);
		System.out.println(tgif);
		
		
		

	}

}
