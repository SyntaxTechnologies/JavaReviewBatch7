package com.syntax.class07;

import java.util.Scanner;

public class Lotery {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int lucky = 17;
	int num;
	do {
	System.out.println("please enter a number 1-20");
	num = scan.nextInt();
	} while (num != lucky);
	
	
		System.out.println("Congrats , you won!!!");

}
}
