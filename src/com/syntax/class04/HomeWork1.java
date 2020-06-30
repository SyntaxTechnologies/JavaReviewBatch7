package com.syntax.class04;
import java.util.Scanner;
public class HomeWork1 {

	public static void main(String[] args) {
	Scanner money = new Scanner(System.in);
	System.out.println("Hello, I am a Bank Specialist.");
	System.out.println("Please, enter how muth money you need?");
	 int num1 = money.nextInt();
	 	System.out.println("--------------------------------------------------");
	 	if (num1 > 200000) {
	 		System.out.println( "no credit today!!!");}
	 	if	(num1 <= 200000) {
	 		System.out.println("Yes .We will a lonn today");
	 		System.out.println("Yes .We will a lonn today");
	 	}
	
	}

}
