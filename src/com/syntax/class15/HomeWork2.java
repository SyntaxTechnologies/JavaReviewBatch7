package com.syntax.class15;
import java.util.Scanner;
public class HomeWork2 {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.println("print please any words");
		 String word = skan.nextLine();
		 	String reverse = "";
		 	
		 	for (int a = word.length()-1; a>=0; a--) {
		 		reverse +=word.charAt(a);
		 	}
		 	System.out.println(reverse);
		 	
		 	
	}

}
