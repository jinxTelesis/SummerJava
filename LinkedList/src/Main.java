import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		//convert stuff array to a list
		String[] stuff = {"great", "notsoGreat", "cheese", "grain","walk"};
		List<String> Listone = Arrays.asList(stuff);
		
		String[] rockenrole = {"great", "really good", "lazy","fmdsf","blue"};
		List<String> ListTwo2 = Arrays.asList(rockenrole);
		
		
		
		String[] stuffme = {"love","me","streak","bob","chicken","firearms"};
		List<String> ListTwo = Arrays.asList(stuffme);
		
		ArrayList<String> listIt = new ArrayList<String>();
		listIt.add("moo");
		listIt.add("twohundred");
		listIt.remove(0);
		listIt.remove(0);
		
		
		
		
		ArrayList<String> list50 = new ArrayList<String>();
		list50.add("Dog");
		list50.add("Doggy");
		list50.add("SpaceMan");
		list50.remove(0);
		list50.remove("Dog");
		
		ArrayList<String> list22 = new ArrayList<String>();
		list22.add("youtube");
		list22.add("google");
		list22.add("digg");
		list22.add("wtf happend to my additions");
		
		
		for(String x : Listone)
			System.out.printf("%s ", x);
		
		for(String y : ListTwo)
			System.out.printf("%s ", y);
		
		Collections.addAll(list50, stuffme);
		
		Collections.addAll(list22, stuff);
		
		System.out.println();
		for(String x : list22)
			System.out.printf("%s ", x);
		
		System.out.println(Collections.frequency(list22, "digg"));
		
		boolean tof = Collections.disjoint(Listone, list22);
		boolean tof2 = Collections.disjoint(ListTwo, list50);
		
		System.out.println(tof); // false has elements in common
		
		if(tof)
			System.out.println("These list do not have anything in common");
		else
			System.out.println("These list must have something in common!");
		
		
		
	}
	
	
}
