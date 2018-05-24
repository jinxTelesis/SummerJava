
public class Main {

	public static void main(String[] args) {
		boolean nothingInCommon;
		nothingInCommon = true;
		int i, j;
		String s1 = "taco";
		String s2 = "taco";
		
		i = 0;
		bigloop: while (i < s1.length()) {
			j = 0;
			while (j < s2.length()) {
				if (s1.charAt(i) == s2.charAt(j))
				{
					nothingInCommon = false;
					break bigloop;
				}
				j++;
			}
			i++;
		}

	}

}
