import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		//convert stuff array to a list
		String[] stuff = {"great", "notsoGreat", "cheese", "grain","walk"};
		List<String> Listone = Arrays.asList(stuff);
		
		ArrayList<String> list22 = new ArrayList<String>();
		list22.add("youtube");
		list22.add("google");
		list22.add("digg");
		
		for(String x : Listone)
			System.out.printf("%s ", x);
		
		Collections.addAll(list22, stuff);
		
		System.out.println();
		for(String x : list22)
			System.out.printf("%s ", x);
		
		System.out.println(Collections.frequency(list22, "digg"));
		
		
	}
	
	
}
