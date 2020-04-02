package com.hana.examples;

public class FanRunner {  
	public static void main(String[] args) {   
		fan fan = new fan("Manufacturer 1", 0.34567, "GREEN");   
		fan.switchOn();   
		System.out.println(fan);   
		fan.setSpeed((byte)3);   
		System.out.println(fan);   
		fan.switchOff();   
		System.out.println(fan);  
		} 
	}

