package com.syntax.class10;

public class ArrayLength {

	public static void main(String[] args) {
		String[] names = new String[5];
		
		names[3] = "Kamila";
		names[1] = "Elgan" ;
		names[4] = "Denis";
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		int arrLength = names.length;
		System.out.println("the length of the array is: " + arrLength);
	}

}
