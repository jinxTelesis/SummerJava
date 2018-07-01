package oop;

public class TubeLight extends Light{
	
	public static String lightType = "Tube Light"; // hiding field in parent
	
	@Override
	public double energyCost(final int noOfHours) {
		return noOfHours;
		
	}

}
