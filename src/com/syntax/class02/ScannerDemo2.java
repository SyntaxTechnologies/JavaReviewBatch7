package com.syntax.class02;
import java.util.Scanner;
public class ScannerDemo2 {
	public static void main(String[] args) {
		
		 System.out.println("IS the checkbox Displayed?");
		 Scanner scan = new Scanner(System.in);
		 
		 boolean isDisplayed = scan.nextBoolean();
		 
		  System.out.println("IS THE CHECKBOX selected?");
		  boolean isSelected = scan.nextBoolean();
		  
		   if(isDisplayed) { 
			   System.out.println("Checkbox displayed!!!!");
		   
		    if (isSelected) { 
		    	System.out.println("Checkbox already selected");
		   
		   } else {System.out.println("it is not selected. You can click on it");}}
		    
		    else {System.out.println(" not displayed");}
		
		
		
		
		
		
	}}