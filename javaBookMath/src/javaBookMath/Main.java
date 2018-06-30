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
		
		
		int[][] squareMatrix = {{4,3,5},{2,1,6},{9,7,8}};
		int sum =0;
		outer: for (int i =0; i < squareMatrix.length;i++) {
			for(int j = 0; j < squareMatrix[i].length; j++) {
				if (j == i) continue;
				System.out.println("Element[" + i + ", " + j + "]: " + squareMatrix[i][j]);
				sum += squareMatrix[i][j];
				if (sum > 10) continue outer;
				// continue goes to innner for loop
			}
			// continue outer goes to outer for loop
		}
		System.out.println(("Sum: " + sum));
		
	}
	
}


