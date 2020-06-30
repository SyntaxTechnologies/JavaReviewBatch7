package com.syntax.class04;
import java.util.Scanner;
public class Temporary06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter value");
		int num1 = scan.nextInt();
		System.out.println("Please enter value ");
		int num2 = scan.nextInt();
		
		System.out.println("---------------------")	;
		System.out.println("Value is " + num1 + " and " + num2);
		 if (num1 > num2 ) { 
			 System.out.println(" num1 bigger if number 2");
		 }
		 else if (num1 < num2) {
			 System.out.println("number 2 if bigger if number 1");
		 }
		 else { System.out.println("numbers equal");
		 }
		 

		
		
		
		

	}

}
