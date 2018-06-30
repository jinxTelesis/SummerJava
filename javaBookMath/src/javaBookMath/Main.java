package javaBookMath;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("i sqrt(i)");
		for(int i = 1; i <=5; ++i) {
			if(i == 4) continue;
		// Rest of loop skipped when i has value of 4
		System.out.printf("%d     %.2f%n", i,Math.sqrt(i));
		// Continue with update expression in the loop header
		}

	}

}
