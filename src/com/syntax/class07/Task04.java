package com.syntax.class07;

public class Task04 {
public static void main(String[] args) {
	
	int num1 = 20;
	while (num1 > 1) {
	 if (num1 % 2 == 0) {
	 System.out.print(num1 + " ");}
	 num1--; }
	
	System.out.println();
	System.out.println("------------------2 way----------------------------------");
	
	
	int num2 = 20;
	while (num2 > 1) {
		System.out.print(num2 + " ");
		num2-=2;
	}
	
}
}
