package com.syntax.class14;
import java.util.Scanner;
public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Moms first name?");
		 String name1 = scan.next();
		System.out.println("Dads first name?");
		 String name2 = scan.next();
		 System.out.println("Its Boy or Girl?");
		 String Gender = scan.next();
		 	 if (Gender.equalsIgnoreCase("boy")) {
		 		String name3 = name1.substring(2, 4);
		 		
		 		String name4 = name2.substring(0, 3);
		 		 System.out.println(name4 + name3);}
		 		else if (Gender.equalsIgnoreCase("girl")) {
		 			String name3 = name1.substring(0, 2);
			 		String name4 = name2.substring(3, 6);
		 		 System.out.println(name3 + name4);
		 	 }
		 	 //String babyName = name1.substring(0, 3) + name2.substring(0, 2);
		 	// System.out.println(babyName);
		

	}

}
