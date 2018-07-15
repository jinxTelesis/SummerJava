package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunWithPalindromesV4 {
	
	private static boolean isCaseSensitivePalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	private static boolean isCaseInsensitivePalindrome(String str) {
		return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	}
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("Otto");words.add("ADA");words.add("Alya");
		
		List<String> palindromes1 = filterStrings(words,
				str -> isCaseSensitivePalindrome(str));
		System.out.println("Case-insensitive palindromes: " + palindromes1);
		
		List<String> palindromes2 = filterStrings(words, str ->
		isCaseInsensitivePalindrome(str));
		System.out.println("case-insensitive palindromes" + palindromes2); 
		
		Predicate<String> predicate3 = str -> !isCaseSensitivePalindrome(str);
		List<String> nonPalindromes = filterStrings(words, predicate3);
		System.out.println("Case-sensitive palindromes, length > 3: " + nonPalindromes);
		
	}
	
	public static <E> List<E> filterStrings(List<E> list, Predicate<E> predicate){
		List<E> result = new ArrayList<>();
		for(E element : list)
			if(predicate.test(element))
				result.add(element);
		return result;
	}

}
