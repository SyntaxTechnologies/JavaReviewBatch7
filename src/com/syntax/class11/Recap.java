package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		int[] grades = new int[5];
		grades[4] = 90;
		int size = grades.length;
		System.out.println("Array size is: " + size);

		grades[4] = 90;
		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;

		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / size;
		System.out.println("Class average is: " + average);
		int total = 0;
		for (int k = 0; k<5; k++) { 
			total += grades[k];}
			System.out.println("Class average is: " + total / size);
		
		
		
		
		System.out.println("----------------------------------------------");

		String[] cities = { "Fairfax", "Kiev", "Tampa", "Washington", "Arlington", "NYC", "Lorton", "Chicago" };
		System.out.println("Ilive in " + cities[2]);
		int i = 1;
		System.out.println("I live in " + cities[i]);

		i += 2;
		System.out.println("I moowed in:  " + cities[i]);

		int cityLenght = cities.length;
		System.out.println("Total number of citys: " + cityLenght);
		
		System.out.println("The last city in the list is: " + cities[cityLenght - 2]);
			
		for (int j = 0; j < cityLenght; j++) {
			System.out.println(cities[j]);}
		
	}
}
