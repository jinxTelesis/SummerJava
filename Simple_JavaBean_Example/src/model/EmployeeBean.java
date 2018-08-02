package model;

import java.io.Serializable;

public class EmployeeBean implements Serializable { // javabean has to implement Serializable
	
	// java bean so private fields with getters and setters standard
	// default no arg constructor
	private String firstName;
	private String lastName;
	private int startYear;
	private double payRate;
	
	public EmployeeBean() {
		
	} // need this for it to be a java bean
	

	public String getFirstName() { // need these for javabean. 
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public EmployeeBean(String firstName, String lastName, int startYear, double payRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.startYear = startYear;
		this.payRate = payRate;
	}
	
	
	

}
