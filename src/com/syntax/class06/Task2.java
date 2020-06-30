package com.syntax.class06;

import java.util.Scanner;
public class Task2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 System.out.println("Is it sunny outside?");
	    boolean isSunny = scan.nextBoolean(); 
	    System.out.println("What is the temperature outside?");
		Scanner scan2 = new Scanner(System.in);
	    int temp  = scan2.nextInt();
	    
	    if (isSunny && temp > 85) { 
	    		System.out.println("It is a sunny day, I should go somewhere!");
	    		System.out.println("I am going to the beach");}
	 
	        		else if (isSunny && temp <= 85) {
	        		System.out.println("I am going to the park");}
	        	else {System.out.println("I stay home and practice Java!");}	 
			     		
	        	}}
	        	
	
	    

