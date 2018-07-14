package oop;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	
private StringBuilder banner;
	
	private static List<String> strList;
	
	public Test(String str) {
		banner = new StringBuilder(str);
	}

	public static void main(String[] args) {
		
		strList = new ArrayList<>();
		strList.add("Otto"); strList.add("ADA"); strList.add("Alyla");
		strList.add("Bob");
		
		Test tObj = new Test("Love ");
		Predicate<String> p = tObj.getPredicate();
		System.out.println(p.test("never dies!") + " " + tObj.banner);
		
		
	}
	
	public Predicate<String> getPredicate(){
		return str -> {
			System.out.println("List: " + strList);
			banner.append(str);
			return str.length() > 5;
		};
		}
	
	
	
	public static <E> void printListWithIndex(List<E> list) {
		List<String> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			newList.add(i + ":" + list.get(i));
		}
	}
	
	

}
