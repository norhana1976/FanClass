package com.hana.examples;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("11 Jalan Dagang 19", "Ampang", "KL", "56100");
		Customer customer = new Customer("Norhana", homeAddress);
			
		customer.printthis("Norhana", homeAddress);
	}

}
