package com.syntax.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int num4 = 25;
		
		int [] numbers = new int[4];
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		System.out.println(numbers[3]);
		
		
		
	int element0 = 	numbers[0];
	String[] carArray;
	String carArray1[];
	carArray = new String[3];
	carArray[0] = "BMW";
	carArray[1] = "Toyota";
	carArray[2] = "Benz";
	//carArray[3] = "Tesla";
	String car = carArray[2];
	System.out.println(carArray[2]);
	System.out.println(car);
	System.out.println("------------------------");
     char [] letters = new char[4];
     letters[0] = 'A';
     letters [3] = 'B';
     letters [2] = 'G';
     letters [1] = 'z';
     System.out.println(letters[2]);
     letters [2] = 'k';
     System.out.println(letters[2]);
     
}}
