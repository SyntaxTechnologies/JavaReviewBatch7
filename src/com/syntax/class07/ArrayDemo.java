package com.syntax.class07;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 9, 1 };

		// I don't need to create an instance because it is a static method
		// ArrayManipulation a = new ArrayManipulation();

		int biggest = ArrayManipulation.largest(arr);
		System.out.println("largest is: " + biggest);

		int result = ArrayManipulation.sum(arr);
		System.out.println("The sum is: " + result);

		ArrayManipulation.printSum(arr);

		int[] arr1 = { 5, 2, 6, 9, 1 };
		int[] arr2 = { 6, 2, 4, 7, 1 };
		int[] arr3 = { 1, 0, 2, 8, 3 };

		ArrayManipulation.printArray(arr1);
		ArrayManipulation.printArray(arr2);
		ArrayManipulation.printArray(arr3);

//		// This is to print arr1
//		for (int element : arr1) {
//			System.out.print(element + " ");
//		}
//		System.out.println();
//
//		// This is to print arr2
//		for (int element : arr2) {
//			System.out.print(element + " ");
//		}
//		System.out.println();
//
//		// This is to print arr3
//		for (int element : arr3) {
//			System.out.print(element + " ");
//		}
//		System.out.println();

	}

}
