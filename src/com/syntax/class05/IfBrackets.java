package com.syntax.class05;
import java.util.Scanner;
public class IfBrackets {
	
		public static void main(String[] args) {
		  	Scanner inp = new Scanner(System.in);
		  	System.out.print("In:");
		  	int num = inp.nextInt();
		     
		  	double p = num % 2;
		  	if (num == 0) {
		    	 System.out.println("Entered number is equals to 0");}
		  	else if  (p == 1 ) {
		    	 System.out.println(num + " is negative");
		     }
		  	else if (p == 0) {
			      System.out.println(num + " is positive"); 
			     }							 
		  	
	     
		     
		     
		     
	
			  
	  }}