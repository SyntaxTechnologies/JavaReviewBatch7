package com.syntax.class05;

public class Q1 {
	// Write a program to swap 2 numbers without a temporary variable?

	public static void main(String[] args) {
		int a = 20;
		int b = 30;

		System.out.println("value of a = " + a + " value of b = " + b);

		a = a + b;

		b = a - b;

		a = a - b;

		System.out.println("value of a = " + a + " value of b = " + b);

	}

}
