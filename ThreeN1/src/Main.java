
public class Main {

	public static void main(String[] args) {
		
		int N;
		int counter;
		
		System.out.print("Starting point for sequence: ");
		N = TextIO.getlnInt();
		while (N <= 0) {
			System.out.print(
					"The starting point must be positive. Please try again: ");
			N = TextIO.getlnInt();
		}
		
		counter = 0;
		while (N != 1)
		{
			if (N % 2 == 0)
				N = N /2;
			else
				N = 3 * N + 1;
			System.out.println(N);
			counter = counter + 1;
		}
		
		System.out.println();
		System.out.print("There were ");
		System.out.print(counter);
		System.out.print(" terms in the sequence.");
	}

}
