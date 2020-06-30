package com.syntax.class11;

public class RetrieveElements {

	public static void main(String[] args) {
		char[] grades = {'a', 'b', 'c', 'd', 'f'};
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}
			System.out.println();
			
			System.out.println("---------Print using advanced loop--------");
			for (char element:grades) {
				System.out.print(element + ", ");
			}
		
		System.out.println("--------------------------");
		
		String[] fruits = {"Apple","Orange", "Grapes", "Banana", "Cucumber"};
		
		
		for (String F: fruits) {System.out.print(F + ", ");}
		
		System.out.println("");
		
		
		for (int i = 0; i<fruits.length; i++) {
			if (fruits[i].equals("Grapes"))
				System.out.println(fruits[i] + " is my favorite");
			else  { System.out.println(fruits[i]);}
			
		System.out.println(fruits[i] + ", ");}
		
	}

}
