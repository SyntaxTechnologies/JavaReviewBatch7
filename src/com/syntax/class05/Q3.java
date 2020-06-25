package com.syntax.class05;

public class Q3 {
	// Write a Java Program to print the first 10 numbers of Fibonacci series.
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

	public static void main(String[] args) {
		int a, b, c;
		a = 1;
		b = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

		// HW try to do it with only 2 variables
		// Galamat: Try to do it with no variables

	}
}
