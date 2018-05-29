import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		PriorityQueue<String> vlad = new PriorityQueue<String>();
		
		vlad.offer("first");
		vlad.offer("second");
		vlad.offer("third");
		
		System.out.printf("%s ", vlad);
		System.out.println();
		
		System.out.printf("%s ", vlad.peek()); // element with highest prioryt oposite of a stack
		
		vlad.poll();
		System.out.printf("s ", vlad);
	}
	
	

}
