package com.syntax.class14;

public class StringMethotsMore {

	public static void main(String[] args) {
		System.out.println("----------.charAt() method----------");
		String season = "Summer";
		char character = season.charAt(4);
  System.out.println(character);

  System.out.println("-------.indexOf() method_---------");

	int index = season.indexOf('S');
			System.out.println(index);
			
	System.out.println("---------.substring() method-------");
	String message = "You guys are awersome";
	String newMessage = "message";
	System.out.println(newMessage);
	
	String string = message.substring(4);//take from index4
	System.out.println(string);
	
	String middleword = message.substring(4, 5);
	
	System.out.println(middleword);
	
	
	




	}

}
