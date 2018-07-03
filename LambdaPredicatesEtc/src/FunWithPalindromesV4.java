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
