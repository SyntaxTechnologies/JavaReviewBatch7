package com.syntax.class12;
import java.util.Scanner;
public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int i, num1=0, num2=0;
		int digit = scan.nextInt();
		
		 int num3= digit/2;
		if(digit==0 || digit == 1) {
			System.out.println(digit + " is not prime");}
		else {
			for(i = 2; i<=num1; i++) {
				if(digit %i==0) {
					System.out.println(digit + " is not prime");}
					num2 = 1;
					break;}
				}
			
	if (num2==0 ) {System.out.println(digit + " is Prime number");
		}
		

	}

}
