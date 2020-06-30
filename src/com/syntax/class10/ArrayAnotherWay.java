package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		String [] weekdays = {"Monday", "Tusday", "wednesday", "Thursday", "Friday"};
		System.out.println(weekdays[3]);
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);
		
		//weekdays[5] = "Saturday";
		
		double[]balances = {10000, 23.50, 5540.0};
		System.out.println("Total money is: " + (balances[0] + balances[1] + balances[2]));
		
		//System.out.println("-------------2nd way--------------");
		int total1 = (int) balances[0] + (int) balances[1] + (int) balances[2];
		System.out.println("Total1 is " + total1);
		
		//System.out.println("--------3rd way");
		int total2 = (int) (balances[0] +  balances[1] +  balances[2]);
		System.out.println("Total2 is " + total2);
		
		int[] numbers1 = new int[7654356];
		int[] numbers2 = {};
		numbers2[0] = 5;
		System.out.println(numbers2[0]);
	}

}
