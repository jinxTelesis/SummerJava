import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		String[] stuff = {"babies", "waterfds", "hey", "chicken"};
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		// in java util.
		
		thelist.add("pumpkin");
		thelist.addFirst("firstthing");
		
		// convert back to an array
		stuff = thelist.toArray(new String[thelist.size()]);
		
		for(String x : stuff)
			System.out.printf("%s ", x);
		
		

	}
}
