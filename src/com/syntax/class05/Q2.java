package com.syntax.class05;

public class Q2 {
	// Write a java program to check whether a given number is prime or not?

	// prime number is greater than 1
	// prime number is only divisible by 1 and itself
	// 1 is not prime
	// 2 (1, 2) prime
	// 3 (1, 3) prime
	// 4 (1, 2, 4) not prime
	// 5 (1, 5) prime
	// 6 (1, 2, 3, 6) not prime

	public static void main(String[] args) {
		int number = 35;
		boolean prime = true;

//		if (number > 1) { // I will check
//			// try to divide it by 2, 3, 4, 5, 6 ... 293-1
//			// if it is divisible by any of these numbers, it is not prime
//			for (int i = 2; i < number; i++) {
//				System.out.println("try to divide by " + i);
//				if (number % i == 0) { // number is divisible by i
//					prime = false;
//					break;
//				}
//			}
//
//		} else {
//			prime = false;
//		}

		// This was correct!
		// Can we improve it?
		// 1st improvement, try to divide it until number/2
		// 2nd improvement, try to divide it until number/i
		// (Gozde found it, she it hired)
		// if number is not divisible up to its square,
		// we don't need to continue checking

		if (number > 1) {
			for (int i = 2; i <= number / i; i++) {
				System.out.println("try to divide by " + i);
				if (number % i == 0) { // number is divisible by i
					prime = false;
					break;
				}
			}

		} else {
			prime = false;
		}

		System.out.println("The number " + number + " is prime: " + prime);

	}

}
