package oop;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
		ArrayList<String> palindromes = new ArrayList<String>(20);
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10); intList.add(100); intList.add(1000);
		
		palindromes.add("level"); palindromes.add("Ada"); palindromes.add("kayak");
		System.out.println(palindromes);
		
		List<String> wordList = new ArrayList<>(palindromes);
		System.out.println(wordList);
		
		List<StringBuilder> synonyms = new ArrayList<>();
		List<Integer> attendence = new ArrayList<>();
		List<List<String>> ListOfLists = new ArrayList<>();
		
		Object[] objArray = new String[10];
		
		List<String> list1 = new ArrayList<>();
		list1.add(0, "First");
		list1.add(list1.size(), "Last");
		
		List<StringBuilder> sbList = new ArrayList<>();
		
		List<Integer> intList2 = new ArrayList<>();
		intList2.add(10); intList2.add(20); intList2.add(1);
		
		//List<String> strList2 = new ArrayList<>(strList);
		//boolean trueOrFalse = strList.equals(strList2);

		String[] wordArray = {"level", "Ada", "kayak", "Bob", "Rotator", "Bob"};
		
		System.out.println("Create an empty list of strings");
		List<String> strList = new ArrayList<>();
		printListWithIndex(strList);
		
		for(String str : wordArray) {
			strList.add(str);
			printListWithIndex(strList);
		}
		
		strList.add(2, "Java");
		printListWithIndex(strList);
		
		String oldElement = strList.set(1, "Naan");
		System.out.println("Element that was replaced: " + oldElement);
		printListWithIndex(strList);
		
		printListWithIndex(strList);
		
		System.out.println("Element removed: " + strList.remove(0));
		printListWithIndex(strList);
		
		System.out.println("Element removed: " + strList.remove("Java"));
		printListWithIndex(strList);
		
		System.out.println("The size of the list is " + strList.size());
		
		boolean result = strList.isEmpty();
		System.out.println("The list " + (result ? "is" : "is not") + " empty.");
		
		System.out.println("First element: " + strList.get(0));
		System.out.println("Last element: " + strList.get(strList.size() - 1));
		
		List<String> strList2 = new ArrayList<>(strList);
		boolean trueOrFalse = strList.equals(strList2);
		System.out.println("The lists strList and strList2 are" + (trueOrFalse ? "" : " not " + " equal."));
		strList2.add(null);
		printListWithIndex(strList2);
		trueOrFalse = strList.equals(strList2);
		
		boolean found = strList.contains("Naan");
		String msg = found ? "contains" : "does not contain";
		
		int pos = strList.indexOf("Bob"); // basically a re find 
		pos = strList.indexOf("BOB");
		
		pos = strList.lastIndexOf("Bob");
		printListWithIndex(strList);
		
		for(int i = 0; i <strList.size(); i++) {
			System.out.println(i + ":" + strList.get(i) + " ");
		}
		
		for(String str : strList) {
			System.out.println(str + " ");
		}
		
		Object[] objArra = strList.toArray();
		System.out.println(objArray.length); // no need to call array length just 
		
		for(Object obj : objArray) {
			String str = (String) obj; // cast
			//System.out.print(str.length() + " ");
		}
		
		String[] strArray = strList.toArray(new String[0]);
		System.out.println(strArray.length);
		
		for (String str : strArray) {
			System.out.println(str.length() + " ");
		}
		
		
		
	}
	
	public static <E> void printListWithIndex(List<E> list) {
		List<String> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			newList.add(i + ":" + list.get(i));
		}
	}
	
	

}
