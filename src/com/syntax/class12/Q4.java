package com.syntax.class12;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		// write program to find second largest number in the array
		// maximum and minimum number in the array?
		
		int [] numbers = {32, 61, 16, 89, 74, 25};
		//let try to find the maximum number
		int max = numbers[0];
		int min = numbers[0];
		for (int num : numbers) {
			if (num >  max) {
				// I found bigger number
				max = num;
			}
			if (num < min) {
				//I found a smaller number
				min = num;
			}
		}
		
			System.out.println("Maximum is: " + max);
			System.out.println("Minimum is: " + min);
			
			// 2nd way
			Arrays.sort(numbers);
			System.out.println("Maximum is: " + numbers[numbers.length - 1]);
			System.out.println("Second lurgest : " + numbers[numbers.length -2]);
			System.out.println("Minimum is: " + numbers[0]);
			System.out.println("Minimum is: " + numbers[1]);
			
			
			
			
			
	}
	

}
