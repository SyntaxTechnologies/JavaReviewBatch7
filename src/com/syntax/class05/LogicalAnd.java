package com.syntax.class05;

public class LogicalAnd {
public static void main(String[] args) {
	int num1 = -53;
	 
	if(num1 >= 1 || num1 <=  10) {
		System.out.println("small");
		}
		else if (num1 >= 11 && num1 <= 100) { 
			System.out.println("medium");
		}
		else if ( num1 > 100 && num1 < 1000) {
			System.out.println("large");
		}
		 else { System.out.println("extra large");}

}
}
