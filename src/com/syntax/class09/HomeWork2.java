package com.syntax.class09;
import java.util.Scanner;
public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double  money;
		double  totalAmound = 0;
		double  remainingBalance;
		double change;
		System.out.println("Please enter the item you wanna buy?");
		String item = scan.nextLine();
		System.out.println("Please enter the price :");
		double price = scan.nextDouble();
		
		do { 
			System.out.println("Please give me the payment");
			money= scan.nextDouble();
			totalAmound += money;
			
			if (totalAmound < price) {
				remainingBalance = price - totalAmound;
				System.out.println("You should give this much more money: " + remainingBalance);
			}else if (totalAmound > price) {
				change = totalAmound- price;
				System.out.println("your change is " + change);
			}
			else { System.out.println("Maan , you gave exactly what you owed me!");}
		}
			while (totalAmound < price); {
			System.out.println("thank you for shopping");}
		
		
	}
	}

