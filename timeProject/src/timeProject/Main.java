package timeProject;

public class Main {

	public static void main(String[] args) {
		SecondClass SecObject = new SecondClass();
		System.out.println(SecObject.toMilitary());
		
		SecObject.setTime(10, 50, 10);
		
		System.out.println(SecObject.toString());
		

	}

}
