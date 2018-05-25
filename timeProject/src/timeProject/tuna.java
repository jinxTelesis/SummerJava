package timeProject;

public class tuna {
	private String name;
	private potpie birthday; // reference to potpie object
	
	public tuna(String theName, potpie theDate)
	{
		name = theName;
		birthday = theDate;
	}

	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
		
	}
}
