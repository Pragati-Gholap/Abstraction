package com.jspiders.oops.abstraction1;

public class VehivleDriver {

	public static void main(String[] args) {
		
		Vehicle v= new Bus();
		System.out.println(v.getWheels());
		Bike v1=new Bike();
		System.out.println(v1.getWheels());
			
	

	}

}
