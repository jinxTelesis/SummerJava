import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		//create an array and convert to list
		Character[] rayball = {'p', 'w', 'O'};
		List<Character> ListL = Arrays.asList(rayball);
		System.out.println("List is : ");
		output(ListL); // fill in method later

		//Reverse and print out the list
		Collections.reverse(ListL);
		System.out.println("After reverse : ");
		output(ListL);
		
		//create new array and a new list
		Character[] newRRRRRay = new Character[3];
		List<Character> ListTwo = Arrays.asList(newRRRRRay);
		
		// copy contents of list into list copy
		Collections.copy(ListTwo, ListL);
		System.out.println("Copy of list : ");
		output(ListTwo);
		
		// fill collection with stuff
		Collections.fill(ListTwo,'A');
		System.out.println("After filling the list : ");
		output(ListTwo);
	}
	
	// print method
	private static void output(List<Character> ListL) {
		
		for(Character work: ListL)
		{
			System.out.printf("%s ", work);
		}
		System.out.println();
	}
}
