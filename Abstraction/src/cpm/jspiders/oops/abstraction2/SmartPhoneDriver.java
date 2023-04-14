package cpm.jspiders.oops.abstraction2;

public class SmartPhoneDriver {

	public static void main(String[] args) {
		Phone p1=new S22();
		p1.browser();
		Samsung s1=(Samsung)p1;
		s1.mp3();

	}

}
