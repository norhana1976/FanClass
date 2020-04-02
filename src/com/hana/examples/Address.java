package com.hana.examples;

public class Address {

	private String line1;
	private String city;
	private String state;
	private String zip;
	
	//creation
	// alt+shift+s --> create constructors
	
	public Address(String line1, String city, String state, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String toString() {
		return String.format("line1 -%s, city - %s, state - %s, zip - %s", 
				line1, city, state, zip);
	}
	

	
}
