package enumPractice;


enum Season {SPRING, SUMMER, FALL, WINTER}
enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
enum Month {JAN, FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
enum taste {GREEN,BLACK,RED,ORANGE}

public class Main {

	public static void main(String[] args) {
		
		double principal;
		double rate;
		double interest;
		
		System.out.print("Enter the initial investment: ");
		principal = TextIO.getlnDouble();
		
		System.out.print("Enter the annual interest rate (as a decimal): ");
		rate = TextIO.getlnDouble();
		
		interest = principal * rate;
		principal = principal + interest;
		
		System.out.printf("The amount of interest is $%1.2f%n", interest);
		System.out.printf("The value after one year is $%1.2f%n", principal);
		
		String temp = "";
		Season early = Season.SPRING;
		early = Season.FALL;
		early = Season.SPRING;
		early = Season.WINTER;
		early = Season.SUMMER;
		
		Day day = Day.SATURDAY;
		
		

	}

}
