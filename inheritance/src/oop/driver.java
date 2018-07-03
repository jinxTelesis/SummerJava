package oop;

import java.util.ArrayList;
import java.util.List;

public class driver {

	public static void main(String[] args) {
		
		String billboard = "Just";
		billboard.concat(" lost in space.");
		System.out.println(billboard);
		billboard = billboard.concat(" advertise").concat(" here.");
		
		int[] frequencyData = new int [Character.MAX_VALUE];
		String str = "You cannot change me!";
		
		StringBuilder left = new StringBuilder("left");
		StringBuilder right = new StringBuilder("Right");
		StringBuilder[] strBuilders = {left, right, left};
		String march = String.join("-->", strBuilders);
		System.out.println(march);
		
		ArrayList<StringBuilder> sbList = new ArrayList<>();
		sbList.add(right); sbList.add(left); sbList.add(null); sbList.add(null);
		String lastStr = "[" + String.join(", ", sbList) + "]";
		System.out.println(lastStr);
		
		String[] wordArray = {"yo","yo","yo","yo"};
		
		List<StringBuilder> sbListb = new ArrayList<>();
		
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
