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
		

	}
	
	

}
