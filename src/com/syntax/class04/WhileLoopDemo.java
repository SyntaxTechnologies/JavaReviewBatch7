package com.syntax.class04;

public class WhileLoopDemo {

	public static void main(String[] args) {

		/*
		 * while and do while loop
		 */
		
		
		int num=1;
		
		while(num<=10) {
			System.out.println("Welcome");
			num++;
		}
		
		System.out.println("**************");
		
		int num1=1;
		
		while(num1<=5000) {
			
			if(num1>=2000 && num1<=3000) {
				System.out.println(num1);
			}
			num1++;
		}
	}

}






