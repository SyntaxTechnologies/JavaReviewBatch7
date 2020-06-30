package com.syntax.class11;


public class HomeWork {

	public static void main(String[] args) {
		
		String [] car = {"American", "German", "Korean", "Italian"};
		
		for (String C: car) {System.out.print(C +", ");}
		System.out.println("");
		
		System.out.println("------------Second way-----------------");
		
		for (int car2 = 1; car2 < car.length; car2++) {
			
			System.out.print(car[car2] + ", ");
			}
		
		
		
}}
