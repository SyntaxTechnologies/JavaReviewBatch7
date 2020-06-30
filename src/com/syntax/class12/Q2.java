package com.syntax.class12;

public class Q2 {

	public static void main(String[] args) {
		// write a java program to check whether a given number is prime or not?
		// prime number is greater than 1
		// prime number is only divisible by 1 and it self
		// 1 is not prime
		// 2 (1, 2) prime
		// 3 (1, 3) prime
		// 4 (1,2,4) is not prime
		// 6 (1, 2, 3, 6 ) not prime

		int number = 35;// not prime
		boolean prime = true;

		if (number > 1) { // I will check
			// Try to divide it by 2, 3, 4, 5, 6 ....293-1
			// if it divisible by any of these numbers, it is not prime
			for (int i = 2; i <= number / i; i++) {
				System.out.println("Try to divide by " + i);
				if (number % i == 0) {       // number is divisible by i
					prime = false;
				break;
				}
			}
		} else {
			prime = false;
		}
System.out.println("The number " + number + " is Prime: " + prime);
	}

}
