
class InvalidHoursException extends Exception {}
class NegativeHoursException extends InvalidHoursException {}
class ZeroHoursException extends InvalidHoursException {}

public class Light {
	
	protected String lightType = "Generic Light";
	
	protected double energyCost(int noOfHours) throws InvalidHoursException {
		
		
		System.out.print(">> Light.energyCost(int): ");
		if(noOfHours < 0)
			throw new NegativeHoursException();
		double cost = 00.20 * noOfHours;
		System.out.println("Energy cost for " + lightType + ": " + cost);
		return cost;
	}
	
	
	public Light makeInstance() {
		System.out.print(">> Light.makeInstance(): ");
		return new Light();
	}
	
	public void showSign() {
		System.out.print(">> Light.show(): ");
		System.out.println("Let there be ligth!");
	}
	
	public static void printLightType() {
		System.out.println(">> Static Light.printLightType(): ");
		System.out.println("Generic Light");
	}

}
