package com.syntax.class07;
import java.util.Scanner;
public class ScanerLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int x = 1;
		 do {
		
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("Good AfterNoon " + name);
		x++;}
		 while ( x <=5);
		 scan.close();
			 
		
	}

}
