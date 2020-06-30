package com.syntax.class14;

public class HomeWork {

	public static void main(String[] args) {
		
		String word = "Sunday";
		
		
		String reverse = "";							// String newString = "";
														//for(int i = word.length()-1; i>=0; i--) { 
		for(int i = word.length()-1; i>=0; i--) {       //char letter = day.charAt(i);
			reverse+= word.charAt(i);			        //newString+=day.charAt(i);
		}												//}
			System.out.println(reverse);				//System.out.println(letter);
		
		
		

	}

}
