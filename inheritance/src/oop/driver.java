package oop;

public class driver {

	public static void main(String[] args) {
		
		int[] frequencyData = new int [Character.MAX_VALUE];
		String str = "You cannot change me!";
		
		for(int i =  0; i < str.length(); i++)
		{
			try {
				frequencyData[str.charAt(i)]++;
				
			} catch (StringIndexOutOfBoundsException e)
			{
				System.out.println("Index error detected: " + i + " not in range.");
			}
		}
		
		System.out.println("Character frequency for string: \"" + str + "\"");
		for(int i =0; i < frequencyData.length; i++) {
			if(frequencyData[i] !=0)
				System.out.println((char)i + "( code " + i + "): " + frequencyData[i]);
		}
		
		System.out.println("Copying into a char array:");
		char [] destination = new char [str.length() - 3];
		str.getChars(0, 7, destination, 7);
		
		for(int i = 0; i < destination.length; i++) {
			System.out.println(destination[i]);
		}
		System.out.println();

	}

}
