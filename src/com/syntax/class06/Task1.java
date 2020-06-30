package com.syntax.class06;
import java.util.Scanner;
public class Task1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your country:");
	
	String country  = scan.next();
	String lunguage;
	switch (country.toLowerCase()) {
			case  "russia":
			lunguage = "rusLang";
			break;
		
			case  "Ukrainian":
			lunguage = "ukrLang";
			break;	
		
			case  "Turkish":
			lunguage = "TurkLang";
			break;	
			default : 
				lunguage = "Unknown";
		}
	System.out.println("Speaks " + lunguage);
		}
}

