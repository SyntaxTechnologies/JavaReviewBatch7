package com.syntax.class07;

public class SmithMember {

	// This static variable belongs to the class
	static String lastName;

	String firstName;
	int age;

	public void printInfo() {
		System.out.println(firstName + " " + lastName + " is " + age + " years old!");
	}

}