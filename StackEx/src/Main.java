import java.util.*; // most of the containers are here

public class Main {

	public static void main(String[] args) {
		
		Integer[] iray = {1, 2, 3, 4};
		Character[] cray = {'b','d','r','r'};
		
		printMe(iray);
		printMe(cray);

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
}