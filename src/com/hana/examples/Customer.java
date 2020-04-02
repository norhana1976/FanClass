package com.hana.examples;

public class Customer {
	//state
	private String name;
	private Address homeAddress; //object composition (object in object)
	private Address workAddress; //object composition (object in object)
		
		//creation
	public Customer(String name, Address homeAddress) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	//public String toString() {
		//return String.format("name - %s,  homeAddress - %s, workAddress - %s", 
			//	name, homeAddress, workAddress);
		
		
	//}
		public void printthis(String name, Address Address) {
	System.out.printf("Name: %s, Home: %s", name, Address).println();
}

}
