import java.util.*; // most of the containers are here

public class Main {

	public static void main(String[] args) {
		
		String[] things = {"apple", "bob", "ham","bob","bacon"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list); // set removes duplicates
		System.out.printf("%s ", set);
	
	

	}
}