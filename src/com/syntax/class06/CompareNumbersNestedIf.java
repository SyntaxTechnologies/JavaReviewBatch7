package com.syntax.class06;
import java.util.Scanner;
public class CompareNumbersNestedIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		double a = scan.nextDouble();
		System.out.println("Please enter the second number: ");
		double b = scan.nextDouble();
		System.out.println("Please enter the third number: ");
		double c = scan.nextDouble();
		double largest;
		
		if (a>b) {
			if (a > c) {
				largest = a;}
			else {
				largest = c;}
			
			}else if ( b > c) {
				largest = b;}
			else  {largest = c;
			}
				System.out.println("Largest number is " + largest);}}
			
	
		
	


