
abstract public class Light {
	
	// Fields:
	int noOfWatts; 
	boolean indicator;
	String location;
	
	// Instance methods:
	public void switchOn() { indicator = true;}
	public void switchOff() { indicator = false;}
	public boolean isOn() {return indicator;}
	
	//Abstract instance method
	public abstract double kwhPrice();
	
}

