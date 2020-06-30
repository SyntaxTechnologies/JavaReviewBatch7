package com.syntax.class14;

public class StringMethods {
public static void main(String[] args) {
	  //first way
	String name = "Olga";
		// second way
	String name1 = new String();
	name1 = "Olga";
	
	System.out.println(name);
	System.out.println(name1);
	// method of String class
	
	String school = "Syntax";
	
	int size = school.length();
	System.out.println("The length of the String is = " + size );
	String greetings = "Hello  syntax" ;
	int sizeOfDifferentString = greetings.length();
	System.out.println(sizeOfDifferentString);
	
	
	String city = "Washington DC";
	String newCity  = city.toUpperCase();	

	System.out.println(newCity);
	
	String lowerCaseString = newCity.toLowerCase();
	System.out.println(lowerCaseString);
	
	System.out.println("---------------concat-------------------------");
	
	
	String country = "USA";
	String capital = "Washington DC";
	System.out.println(country + "=" + capital);
	System.out.println(country.concat(capital));
	
	System.out.println("---------------.isEmty() method-------------------------------");
	
	String str = " ";
	boolean isEmpty = str.isEmpty();
	System.out.println(isEmpty);
	
	String str1 = "";
	
	System.out.println(str1.isEmpty());
	System.out.println("------------.trim() method------------");// delite spase before and after
	
	String cat = "Jessey";
	String dog = "    Charley";
	
	System.out.println(cat.trim());
	System.out.println(dog.trim());
	
	
	
	
	
	
	
}
}
