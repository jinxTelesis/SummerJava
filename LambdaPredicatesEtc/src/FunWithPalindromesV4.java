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
		words.add("Otto"); words.add("ADA"); words.add("Alyla");
		words.add("Bob"); words.add("Hannah");
		
		List<String> palindromes1 = filterStrings(words,
				str -> isCaseSensitivePalindrome(str));
		
		List<String> palindromes2 = filterStrings(words, str->
				isCaseInsensitivePalindrome(str));
		System.out.println("Case-insensitive palindromes:    " + palindromes2);
		
		Predicate<String> predicate3 = str -> !isCaseSensitivePalindrome(str);
		List<String> nonPalindromes = filterStrings(words, predicate3);
		
		Predicate<String> predicate4 = str -> str.length() > 3;
		List<String> strGT3 = filterStrings(words, predicate4);
		System.out.println("Words with length > 3:      " + strGT3);
		
		Predicate<String> predicate5 = str->
			str.length() > 3 && isCaseSensitivePalindrome(str);
		List<String> palindromesGT3 = filterStrings(words, predicate5);
		System.out.println("Case-sensitive palindromes, length > 3: " + palindromesGT3);
		
		
		
		Predicate<String> predicateA = str -> {
			return str.length() > 3 && isCaseSensitivePalindrome(str);
		};
		
		Predicate<String> predicateB = str -> {
			boolean result1 = str.length() > 3;
			boolean result2 = isCaseSensitivePalindrome(str);
			return result1 && result2;
		};
		
		Predicate<String> predicateC = str -> {
			if(str == null || str.equals("") || str.length() <= 3) {
				return false;
			}
			StringBuilder sb = new StringBuilder(str);
			boolean result = str.equals(sb.reverse().toString());
			return result;
		};
		
		
		
		
	}
		

	// not finished
	private static <E> List<E> filterStrings(List<E> list, Predicate<E> predicate) {
		
		List<E> result = new ArrayList<>();
		for (E element : list)
		{
			if (predicate.test(element))
				result.add(element);
			
		}
		
		
		return result;
	}

}
