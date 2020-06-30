package com.syntax.class02;

public class StringConcatenationDemo {

	public static void main(String[] args) {
		// I love Lili
		String name = "Lili";
		System.out.println("I Love " + name);
		System.out.println("I Love" + ' ' + name);
		
		String statement = "I Love ";
		System.out.println(statement + name);
		String car = "jeep ";
		int year = 2015;
		System.out.println(name + " has a car " + car + year);

	}

}
