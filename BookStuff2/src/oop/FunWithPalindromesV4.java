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
		
		
	}
	
	public static <E> List<E> filterStrings(List<E> list, Predicate<E> predicate){
		List<E> result = new ArrayList<>();
		for(E element : list)
			if(predicate.test(element))
				result.add(element);
		return result;
	}

}
