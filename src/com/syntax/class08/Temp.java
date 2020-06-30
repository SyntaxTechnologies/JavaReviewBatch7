package com.syntax.class08;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Start point");
	    int num1   = scan.nextInt();
	    System.out.println("End point");
	    int num2 = scan.nextInt();
	     int sumEven = 0;
	     int sumOdd = 0;
	     
	     for (int i = num1; i <= num2; i++) {
	    	 if (i % 2 == 0) {
	    	sumEven = sumEven + i;
	     
	     } else {
	    		 sumOdd += i;
	    	 } }
	    System.out.println("SumOdd = " + sumOdd);
	    System.out.println("sumEven = " + sumEven);
	    }
}
	