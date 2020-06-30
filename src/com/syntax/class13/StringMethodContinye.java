package com.syntax.class13;

public class StringMethodContinye {

	public static void main(String[] args) {
		System.out.println("-----------.contains() method----------");
		
		String str = "Good afternoon all";
		//String searchValue = "afternoon";
		
		 boolean contains  = str.contains("afternoon");
		 System.out.println(contains);
		 
		String searchValue = "good";
		 
		boolean  isItThere = str.contains(searchValue);
		System.out.println(isItThere);
		
		System.out.println(str.contains("A"));
		
		
		System.out.println("-------.startWith() method-----------");
		
		
		String drink = "water";
		boolean starts = drink.startsWith("w");
		System.out.println(starts);
		
		
		System.out.println("-------.endsWith() method---------");
		boolean ends = drink.endsWith("a");
				System.out.println(ends);
				
				
	System.out.println("------------------");
	
	String str1 = "Hello Mohammad";
	String str2 = "Hello Bulat";
	
	System.out.println("String " + str1 + " " + str1.startsWith("Hello"));
	
	System.out.println("----------.equals() method-----------");
	
	
	String string1 = "Saturday";
	String string2 = "saturday";
	
	boolean equality = string1.equals(string2);
	System.out.println(equality);
	
	boolean equalityNoCase = string1.equalsIgnoreCase(string2);
	System.out.println(equalityNoCase);
	
	
	String expected = "Password cannot be empty";
	String actual = "Password can not be empty";
	
	if (expected.equals(actual)) {
		System.out.println("Test pass");
	} else {
		System.out.println("Test fail");
	}
	
	System.out.println("-----------real example of equalsignoreCase---------- ");
	
	
	String expectedBrowser = "Chrome";
	
	if (expectedBrowser.equalsIgnoreCase("chrome")) {
		System.out.println("Test execute on chrome browser");}
		
	else {
		System.out.println("Test execute NOT on chrome browser");
	}
	
	
	
	
	
	
	
	
	
	
		
	}

}
