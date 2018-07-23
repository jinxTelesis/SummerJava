
public class TubeLight extends Light{
	
	public static String lightType = "Tube Light";
	
	@Override
	public double energyCost(final int noOfHours) throws ZeroHoursException{
		System.out.print(">> TubeLight.energyCost(int): ");
		if(noOfHours == 0)
			throw new ZeroHoursException();
		double cost = 00.10 * noOfHours;
		System.out.println("Energy cost for " + lightType + ": " + cost);
		return cost;
		
	}
	
	public double energyCost() {
		System.out.println(">> TubeLight.energyCost(): ");
		double flatrate = 20.00;
		System.out.println("Energy cost for " + lightType + ": " + flatrate);
		return flatrate;
	}
	
	@Override
	public TubeLight makeInstance() {
		System.out.println(">> TubeLight.makeInstance(): ");
		return new TubeLight();
	}
	
	public static void printLightType() {
		System.out.println(">> Static TubeLight.printLightType(): ");
		System.out.println(lightType);
	}

}
