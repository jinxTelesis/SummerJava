package finaldemo;

public class Light {
	
	public static final double KWH_PRICE = 3.25;
	public static final String MANUFACTURER;
	
	static {
		MANUFACTURER = "Ozam";
	}
	
	//Instance variables
	int noOfWatts;
	final String color;
	final String energyRating;
	
	{
		color = "off white";
	}
	
	// constructor
	Light() {
		energyRating = "A++";
	}
	
	// Final instance method
	final public void setWatts(int watt) {
		noOfWatts = watt;
	}

}
