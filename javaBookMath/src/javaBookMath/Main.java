package javaBookMath;

public class Main {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		double time;
		
		String advice;
		advice = "Seize the day!";
		String badAdvice;
		badAdvice = "Play it safe";
		
		System.out.println(advice.equals(badAdvice));
		System.out.println(advice.equalsIgnoreCase(badAdvice));
		System.out.println(advice.length());
		System.out.println(advice.charAt(1));
		System.out.println(advice.indexOf(badAdvice));
		advice.toUpperCase();
		advice.toLowerCase();
		advice.trim();
		
		startTime = System.currentTimeMillis();
		
		double width, height, hypotenuse;
		width = 42.0;
		height = 17.0;
		hypotenuse = Math.sqrt(width*width + height*height);
		System.out.print("A triangle with sides 42 and 17 has a hypotenuse ");
		System.out.println(hypotenuse);
		
		System.out.println("\nMathematically, sin(x)*sin(x) + "
				+ "cos(x)*cos(x) - 1 should be 0.");
		
		System.out.println(Math.random());
		System.out.println("test1");
		System.out.print("The value of Math.PI is");
		
		endTime = System.currentTimeMillis();
		time = (endTime - startTime) / 1000.0;
		
		System.out.print("\nRun time in seconds was: ");
		
		System.out.println(time);
		
		
		

	}

}
