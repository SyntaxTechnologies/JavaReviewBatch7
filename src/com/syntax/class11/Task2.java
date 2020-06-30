package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		
		
		
		int[] num = new int[6];
		int sum = 0;
		num[1] = 10;
		num[2] = 5;
		num[3] = 9;
		num[4] = 78;
		num[5] = 123;
		int calculate = (num[1] + num[2] + num[3] +num[4]+ num[5]);
        System.out.println("If calculate didgest num = " + calculate );
        
        for (int number:num) {
        	sum += number;}
        	System.out.println("The sum of all numbers is " + sum);
        
        	int total = 0;
        	for ( int i = 0; i < num.length; i++) {
        		int number = num[i];
        		total += number;
        	}
        	System.out.println("The total of all numbers = " + total);	
        	

}}
