package com.hana.examples;

public class Rectangle {
	// state
	private int length;
	private int width;
	
	//creation
	public Rectangle(int length, int width) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}
	
	


	public void setLength(int length) {
		this.length = length;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int area() {
		int area = length * width;
		return area;
	}
	
	public int perimeter() {
		int perimeter = 2 * (length + width);
		return perimeter;
		
	}
	
	//operation
	public String toString() {
		 return String.format("length - %d width -  %d area - %d perimeter - %d",      
				 length, width, area(), perimeter()); 
	}
}
