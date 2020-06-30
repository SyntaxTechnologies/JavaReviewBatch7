package com.syntax.class12;

public class Q3 {

	public static void main(String[] args) {
		// write a java program to print the  first 10 numbers of Fibonacci series.
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 
		
		int a, b, c;
		a = 1;
		b = 1;
		
		for (int i = 1; i <=10; i++) {
			System.out.print(a + " ");
			c = a +b;
			a = b;
			b = c;
		}
		

	}

}
