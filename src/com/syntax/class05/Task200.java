package com.syntax.class05;
import java.util.Scanner;
public class Task200 {

	public static void main(String[] args) {
		    //Scanner scan = new Scanner(System.in);
		    //System.out.println("What is your heights in inches");
		  	//int inch = scan.nextInt();
			//if ( inch < 60) { System.out.println("Short");}
			//else if (inch >= 60 && inch <= 72) { 
			//	System.out.println("Medium");
			//}
			// else if ( inch > 72) { System.out.println("Tall");}
			
			
			System.out.println("---------------------------------");
			System.out.println("What day today in number?");
			Scanner scan2 = new Scanner(System.in);
			int day = scan2.nextInt();
			if (day >= 1 && day <= 5) {
					System.out.println("Weekday");}
				else if (day >= 6 && day <=7) { 
					System.out.println("Weekend");}
				else { System.out.println("Invalid");}
				}
	}


