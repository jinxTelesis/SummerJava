
public class Main {

	public static void main(String[] args) {
		
		boolean[] used;
		
		int count;
		
		used = new boolean[365]; // boolean array
		
		count = 0;
		
		while (true) {
			int birthday;
			birthday = (int)(Math.random()*365);
			count++;
			
			System.out.printf("Person %d has birthday number %d", count, birthday);
			System.out.println();
			
			if (used[birthday])
			{
				break;
			}
			
			used[birthday] = true;
		}
		
		System.out.println();
		System.out.println("A duplicate birthday was found after " + count + "tries.");
	}

}
