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
		
		class Pizza {
			String meat = "beef";
		}
		
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
		
		int[][] mXnArray = {
				{16, 7, 12},
				{9, 20, 18},
				{14,11,5},
				{8,5,10}
		};
		
		int min = mXnArray[0][0];
		
		for (int i =0; i < mXnArray.length; ++i)
		{
			for(int j = 0; j < mXnArray[i].length; ++j)
				min = Math.min(min, mXnArray[i][j]);
		}
		System.out.println("Minimum value: " + min);
		
		int[] dataSeq = {8,4,6,2,1};
		
		printIntArray(dataSeq);
		
		for (int index = 1; index < dataSeq.length; ++index)
		{
			if(dataSeq[index-1] > dataSeq[index])
				swap(dataSeq, index-1, index);
		}
		
		printIntArray(dataSeq);
		
		int[][] matrix2 = {{8,4},{6,3,2},{7}};
		
		int min2 = findMinimum2(matrix2[0]);
		
		for(int i = 1; i < matrix2.length; ++i) {
			int minInRow = findMinimum2(matrix2[i]);// sub min iteration
			min = Math.min(min, minInRow); // checks if value of row 0, 1 and 2 is smallest
		}

	}
	
	public static int findMinimum2(int[] seq) {
		int min = seq[0];
		for (int i = 1; i < seq.length; i++)
		{
			min = Math.min(min, seq[i]);
		}
		return min;
	}
	
	public static void printIntArray(int[] array) {
		for (int value : array)
			System.out.println(" " + value);
		System.out.println();
	}
	
	public static void swap(int[] intArray, int i, int j) {
		int tmp = intArray[i]; intArray[i] = intArray[j]; intArray[j] = tmp;
	}
	
	public static void swap(int v1, int v2) {
		int tmp = v1; v1 = v2; v2 = tmp;
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
