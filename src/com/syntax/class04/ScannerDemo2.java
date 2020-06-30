package com.syntax.class04;
import java.util.Scanner;
public class ScannerDemo2 {

	public static void main(String[] args) {
		
		
		System.out.println(" Please print your full name");
		Scanner input = new Scanner(System.in);
		String name  = input.nextLine();
		System.out.println("You name is " + name);
	
		System.out.println("Plese enter your age as double!");
		double Russian = input.nextDouble();
		System.out.println("Your name is " + name + " and age is " + Russian);
		
		
	}

}
