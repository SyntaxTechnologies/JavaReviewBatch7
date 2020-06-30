package com.syntax.class15;

public class HomeWork4 {

	public static void main(String[] args) {
		
		String str1 = "12345";
		String str2 ="67890";
		
         str1 = str1 + str2;
		
		str2 = str1.substring(0,str1.length() - str2.length());
		str1= str1.substring(str2.length());
		
		System.out.println("String 1 = " + str1);
		System.out.println("String 2 = " + str2);
		
		
		

	}

}
