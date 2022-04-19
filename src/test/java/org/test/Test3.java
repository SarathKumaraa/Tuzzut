package org.test;

public class Test3 {
	
	
	public static void main(String[] args) {
		
	
	String price = "QAR 29.00";
	String[] p1 = price.split(" ");
	System.out.println(p1[0]);
	System.out.println(p1[1]);
	
	float parseFloat = Float.parseFloat(p1[1]);
	System.out.println(parseFloat);
	
	
	}

}
