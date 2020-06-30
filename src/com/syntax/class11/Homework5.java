package com.syntax.class11;

public class Homework5 {
public static void main(String[] args) {
	
	
	
	
	int [][] str ={ {1,1,1}, {1,1,1}, {1,1,1} , {1,1,1}, {100,100,100}};
	int result = 0;
	
	for (int num = 0; num <str.length; num++) {
		for (int num2 = 0; num2 < str[num].length; num2++) {
			
			result += str[num] [num2];
		}
	}
	System.out.println(result);
	
		System.out.println("------------------------------------------------");
	int [] num =  {3, 3, 3, 3, 3, 3} ;
	int sum = 0;
	for (int number:num) {
		sum += number;
	}
		System.out.print(sum);
		System.out.println("");
	System.out.println("----------------------------");
	
	int [][] integer = { {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5,6}};
	int res = 0;
	
	for (int x = 0; x < integer.length; x++) {
		for (int c = 0; c <integer[x].length; c++) {
			res += integer[x][c];
			
		}
	}
	System.out.println(res);
	
	
	
	System.out.println();
	System.out.println("-----------------------------");
	
	
	int [] q = {1,2,3,4,5};
	int w = 0;
	for(int e:q) {
		w +=e; {
			
		} }
		System.out.print(w);
	
	
	
	
	
	
	
	
	
}}

