import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		String[] crap = {"shoes", "apples", "shebait", "mooch", "look"};
		List<String> ListL = Arrays.asList(crap);
		
		Collections.sort(ListL);
		System.out.printf("%s\n", ListL);
		
		

	}
}
