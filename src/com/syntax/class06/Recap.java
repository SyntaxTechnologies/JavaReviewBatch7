package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		int hour = 35;
		String dayTime;
		
		if (hour >=1 && hour <= 11) { 
			dayTime = "Morning" ;}
		
		else if (hour >= 12 && hour <= 15) { 
			dayTime = "afternoon" ;}
		else if (hour >= 16 && hour <= 20) { 
			dayTime = "evening" ; }
		else if (hour >= 21 && hour <= 24) { 
			dayTime = "night" ; }
		else { 
			dayTime = "unknown" ;}
		// if is unknown I don't want to print anyting
		if (!dayTime.equalsIgnoreCase("unknown")) {    
		System.out.println("Right now it is " + dayTime);
		}}}
		
		
		
		
		
		
		
		
	


