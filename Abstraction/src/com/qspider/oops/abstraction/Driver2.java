package com.qspider.oops.abstraction;

public class Driver2 {

	public static void main(String[] args) {
		
		//Demo d1=new Demo(); //CTE(abstract class cannot be instantiated)
		Demo d2= new Demo2();//upcasting(we can create reference type for abstract class)
		d2.m1();
		d2.m2();
	

	}

}
