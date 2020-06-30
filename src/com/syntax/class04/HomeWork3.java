package com.syntax.class04;
import java.util.Scanner;


public class HomeWork3 {

	public static void main(String[] args) {
		Scanner abv =  new Scanner (System.in);
		System.out.println("what is your City?");
		String num1 = abv.next();
		System.out.println("what is the temperature?");
		int num2 = abv.nextInt();
		int tempCels = (int)((num2 * 1.8) + 32.0) ;
		System.out.println( "The temperature is the " + num1 + " is " + tempCels);
		
		 

	}

}
