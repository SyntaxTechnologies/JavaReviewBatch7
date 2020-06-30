package com.syntax.class15;

public class HomeWork1 {

	public static void main(String[] args) {
		String str = "character", reverse = "";
		
		 for (int a = str.length()-1; a >0; a-- ) {
			 reverse +=str.charAt(a);
		 }
		 System.out.println(reverse);

	}

}
