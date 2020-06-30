package com.syntax.class05;

import java.util.Arrays;

public class Q4 {

	// Write a java program to find the second largest number in the array?
	// Maximum and minimum number in the array?

	public static void main(String[] args) {
		int[] numbers = { 32, 61, 16, 89, 74, 92 };

		int largest = numbers[0];
		int largest2 = numbers[0];

		int min = numbers[0];

		for (int num : numbers) {

			if (num > largest) {
				largest2 = largest;
				largest = num;
			} else if (num > largest2 && num != largest) {
				largest2 = num;
			} else if (num < min) {
				min = num;
			}

		}

		System.out.println("The minimum is: " + min);
		System.out.println("The largest is: " + largest);
		System.out.println("Second largest : " + largest2);

		// Let's try to find the maximum

//		// 1st way
//		int max = numbers[0];
//		int min = numbers[0];
//		for (int num : numbers) {
//
//			if (num > max) {
//				// I found a bigger number
//				max = num;
//			} else if (num < min) {
//				// I found a smaller number
//				min = num;
//			}
//
//		}
//
//		System.out.println("Maximum is: " + max);
//		System.out.println("Minimum is: " + min);
//
//		// 2nd way
//		System.out.println("---Sorting---");
//		Arrays.sort(numbers); // This will sort the array from the smallest to the largest
//
//		System.out.println("Minimum is: " + numbers[0]); // The first element
//		System.out.println("Maximum is: " + numbers[numbers.length - 1]); // The last element
//		System.out.println("Second largest : " + numbers[numbers.length - 2]);

	}

}
