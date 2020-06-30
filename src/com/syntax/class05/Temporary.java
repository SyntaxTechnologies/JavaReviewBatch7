package com.syntax.class05;
import java.util.Scanner;
public class Temporary {

	 public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter yours birth month?");
		  String month = scan.nextLine();
		  String season = "Unknown";
		  
		  if (month.equals("June") || month.equals("July") || month.equals("August")) { 
				season = "Summer";}
		else if   (month.equals("September") || month.equals("October") || month.equals("November"))
		  	  		{season = "Fall"; }
		 else if  (month.equals("December") || month.equals("Januery") || month.equals("Febryary")) 
		  	 		{season = "Winter";}
		 else if  (month.equals("Marth") || month.equals("April") || month.equals("May")) 
		  	 		{season = "Spring";}
		  	 	
		  	System.out.println("You were born in " + season);
		  	  
		  	
		  	
		  	
	 }}
		  	
		  	
		  	
		  


