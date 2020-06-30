package com.syntax.class06;

import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first digit");
		double num1 = scan.nextDouble();
		System.out.println("Enter operatot +, -, /, *");
		char operator = scan.next().charAt(0); 
		System.out.println("Enter second digit");
		int num2 = scan.nextInt();
		double result = 0;
		switch (operator) {
		 case  '+':
			 result = num1 + num2;
			 break;
		 case  '-':
			 result = num1 - num2;
		 case  '/':
			 result = num1 / num2;
			 break;	 
		 case  '*':
			 result = num1 * num2;
		 default :
				 System.out.println("Invalid");
		 }
		if (operator == '-'|| operator == '+' || operator == '/' || operator == '*');
		  System.out.println("The result of: (" + num1 + " " + operator + " " + num2 + ") is "   + result);
		

	}

}
