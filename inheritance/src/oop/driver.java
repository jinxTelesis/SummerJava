package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class driver {

	public static void main(String[] args) {
	
		StringBuilder banner = new StringBuilder("love ");
		LocalsOnly instance = new LocalsOnly();
		Predicate<String> p = instance.getPredicate(banner);
		System.out.println(p.test("never dies!" + " " + banner));
		
	
		
	}
		public Predicate<String> getPredicate(StringBuilder banner){
			List<String> words = new ArrayList<>();
			words.add("Otto"); words.add("ADA"); words.add("Alyla");
			words.add("Bob"); words.add("HannaH");
			
			// banner = new StringBuilder(); Illegal not final
			// words = new ArrayList<>(); Illegal not final
			
			return str-> {
				// String banner = "Don't redeclare me!";
				//String[] words = new String[6]; Illegal don't redeclare me in a lambda
				System.out.println("List: " + words);
				banner.append(str);
				return str.length() > 5;
			}
			
		}
	
}
