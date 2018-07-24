
public class ReverseConstructors {
	
	private int noOfWatts;
	private boolean indicator;
	private String location;
	
	ReverseConstructors() {
		this(0, false);
		System.out.println("Returning from no-argument construcor n0. 1.");
	}
	
	ReverseConstructors(int watt, boolean ind){
		this(watt, ind, "X");
		System.out.println("Returning from constructor no.2 ");
	}
	
	ReverseConstructors(int noOfWatts, boolean indicator, String location){
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
	}

}
