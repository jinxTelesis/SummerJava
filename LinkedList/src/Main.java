import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		String[] things = {"apples", "noobs","pawng","garg"};
		List<String> list1 = new LinkedList<String>();
		for(String x : things)
			list1.add(x);
		
		String[] things2 = {"sausage", "bacon", "goats", "blue"};
		List<String> list2 = new LinkedList<String>();
		
		for(String y : things2)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null; // reference that is like a pointer
		
		//printme(list1);
		removeStuff(list1, 2, 5);
		printMe(list1);
		reverseMe(list1);
	}
	private static void printMe(List<String> ListL)
	{
		for (String b : ListL)
			System.out.printf("%s ", b);
		System.out.println();
	}
	
	private static void removeStuff(List<String> ListL, int from, int to) {
		ListL.subList(from, to).clear();
	}
	
	private static void reverseMe(List<String> ListL)
	{
		ListIterator<String> bobby = ListL.listIterator(ListL.size());
		while(bobby.hasPrevious())
			System.out.printf("%s ", bobby.previous());
	}

	
}
