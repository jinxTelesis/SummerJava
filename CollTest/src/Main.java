import java.util.*;


public class Main {

	public static void main(String[] args) {
		String[] identifier = {"eggs", "lasers","hats", "pie"};
		List<String> list1 = new ArrayList<String>();
		
		for(String x: identifier)
			list1.add(x);
		
		String[] morethings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
		
		for(String y: morethings)
			list1.add(y);
		

	}

}
