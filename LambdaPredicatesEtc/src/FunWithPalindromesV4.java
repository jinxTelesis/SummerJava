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
		
		Machine machine = new Machine();
		machine.setState(MachineState.IDLE);
		
		MachineState state = machine.getState();
		
		System.out.println("All machine states: ");
		
		for (MachineState ms: MachineState.values()) {
			System.out.println(ms + ":" + ms.ordinal());
		}
		
		System.out.println("Comparison:");
		MachineState state1 = MachineState.BUSY;
		MachineState state2 = state1;
		MachineState state3 = MachineState.BLOCKED;
		
		System.out.println("Minimum value: " + findMinimum(new int[] {3,5,2,8,6})); // anoynmous array
		System.out.println("max value is : " + findMinimum(new int[] {6,10,14,16,19}));
		System.out.println("black" + findMinimum(new int[] { 10,34,90,57,11}));
		
	}
	
	public static int findMinimum(int[] dataSeq) {
		int min = dataSeq[0];
		for (int index = 1; index < dataSeq.length; ++index)
			if(dataSeq[index] < min)
				min = dataSeq[index];
			return min;
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
