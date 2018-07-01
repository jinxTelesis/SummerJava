package oop;

class InvalidHoursException extends Exception{}
class NegativeHoursException extends InvalidHoursException{}
class ZeroHoursException extends InvalidHoursException {}


public class Light {
	
	protected String lightType = "Generic Light";
	
	protected double energyCost(int noOfHours)
	throws InvalidHoursException {
		System.out.print(">> Light.energyCost(int): ");
		if(noOfHours < 0)
			throw new NegativeHoursException();
		double cost = 00.20 * noOfHours;
		System.out.println("Energy cost for " + lightType + ": " + cost);
		return cost;
	}
	
	public Light makeInstance() {
		System.out.println(">> Light.makeInstance() ");
		return new Light();
	}
	
	public void showSign() {
		System.out.println(">> Light.showSign(): ");
		System.out.println("Let there be light!");
	}
	
	public static void printLightType() {
		System.out.println(">> Static Light.printlLightType() ");
		System.out.println("Generic light");
	}
	
	int[] frequencyData = new int[Character.MAX_VALUE];
	

}
