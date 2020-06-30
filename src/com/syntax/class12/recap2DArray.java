package com.syntax.class12;

public class recap2DArray {

	public static void main(String[] args) {
		
		
		String [][] animals = {
				{ "cat", "dog", "bird", "hamster"},
				{"Tiger", "Children", "Bear"}
		};
//	int HowManyArrays = animals.length;
//	System.out.println(HowManyArrays);

//	int elements1Array = animals[0].length;
//		System.out.println(elements1Array);
		
		for(int r = 0; r<animals.length; r++) {
		for (int c = 0; c < animals[r].length; c++) {
			
			String animal = animals[r][c];
			System.out.print(animal + " ");}}
		System.out.println("");
		System.out.println("-----------------Using ENHANCED FOR LOOP--------------");
		for (String[] array:animals) {
			for (String animal:array) {
				System.out.println(animal);
			}
		}
		
}}
