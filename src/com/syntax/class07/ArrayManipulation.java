package com.syntax.class07;

public class ArrayManipulation {

	public static int largest(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}

		}

		return max;
	}

	// This method will not return the sum
	public static void printSum(int[] array3) {
		int total = sum(array3);
		System.out.println(total);
	}

	// Will return the sum
	public static int sum(int[] array2) {
		int total = 0;

		for (int element : array2) {
			total = total + element;
		}

		return total;
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
