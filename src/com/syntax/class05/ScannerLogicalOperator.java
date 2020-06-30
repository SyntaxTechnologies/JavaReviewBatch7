package com.syntax.class05;
import java.util.Scanner;
public class ScannerLogicalOperator {
		public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			System.out.println(" How old are you?");
			int age = scan.nextInt(); 
				if (age >= 0 && age <= 3 ) { 
					System.out.println("you are baby");
				}
				else if (age >=4 && age <= 5 ) { 
					System.out.println("You are a kid");
				}
				else if (age >= 6 && age <= 12 ) {
					System.out.println("You are kid");
				}
				else if (age >= 13 && age <= 19) { 
					System.out.println(" You are a tinager");
				}
				else if (age >=20 && age <= 64) {
					System.out.println("You are adult");}
					else if (age >= 65) { System.out.println("enjoy life");	
				}
					else {System.out.println("Incorrect");}
}

}
