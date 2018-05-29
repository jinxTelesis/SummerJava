
public class Main {

	public static void main(String[] args) {
		
		Integer[] iray = {1, 2, 3, 4};
		Character[] cray = {'b','d','r','r'};
		
		printMe(iray);
		printMe(cray);
		
		System.out.println(max(19,42,100));
		System.out.println(max("apples","greetings","moo"));

	}
	
	public static void printMe(Integer[] i) {
		for(Integer x : i)
			System.out.printf("%s ", x);
		System.out.println();
	}
	
	public static void printMe(Character[] i) {
		for(Character x : i)
			System.out.printf("%s ", x);
		System.out.println();
	}
	
	// generic method
	public static <T> void printMe(T[] x) {
		for(T b : x)
			System.out.printf("%s ", b);
	}
	
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T m = a; // generic or templated variable
		
		if(b.compareTo(a) > 0)
			m = b;
		
		if(c.compareTo(m) > 0)
			m = c;
		
		return m;
	}


}
