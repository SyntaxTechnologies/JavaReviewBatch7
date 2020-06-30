package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// widening
		double d = (double)7;
		System.out.println(d);
		
		//int i = 7.58; //// Type mismatch: cannot convert from double to int.
		 
		int i = (int) 7.58;
		System.out.println(i);
		
		byte b = (byte)123865;
		System.out.println(b);
		long l1 = 45;
		long l2 = 234826438223l;
		////////////////////
		int number1 = (int)l1;
		System.out.println("number 1 = " + number1);
		////////////////////
		int number2 = (int) l2;
		System.out.println("number2 = " + number2);
		
		
		
	}

}
