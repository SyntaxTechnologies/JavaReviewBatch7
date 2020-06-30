package com.syntax.class05;

import java.util.Scanner;

public class temp2 {
	public static void main(String[] args) {
		System.out.println("Is in sunny outside?");
	    Scanner scan = new Scanner(System.in);
	    boolean isSunny = scan.nextBoolean(); 
	    	if (isSunny == true) { 
	    		System.out.println("It is a sunny day, I should go somewhere!");
	    		System.out.println("What is the temperature outside?");
	    	}
	    	else if (isSunny == false) { 
        		System.out.println("I stay home and practice Java!");}
	    	
	    		int temp  = scan.nextInt();
	     
	        	if (temp > 85) {
	        		System.out.println("I am going to the beach");}
	        	
	        	else if (temp <= 85) {
	        		System.out.println("am going to the park");
	        	}
	        	 
	        	
	}}
	    
