package com.syntax.class04;

import java.util.Scanner;


public class HomeWork4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Are you hawe credit card?");
		String ansver  = scan.nextLine();
		String yes = "yes";
		String no = "no";
			if (ansver.equalsIgnoreCase("no")) {
				System.out.println("maybe you want credit card?");}
			else if (ansver.equalsIgnoreCase("yes")) {
				System.out.println("What a ballance on the card?");
			}
			double ballance = scan.nextDouble();
			
				if (ballance >= 1000) { 
					System.out.println(" Pay the ballance!!!"); }
				
				else   {
					System.out.println("Spend more!!!");}
				}
	
			}
			

		
		
		

	


