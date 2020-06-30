package com.syntax.class11;

public class Largest {
public static void main(String[] args) {
	
	
	int[][] numbers = { {23, 56, 73, 16, 80, 70, 39},
	                    {23,43,304,43}};
	int lurgest = 0;
	for (int num:numbers[0]) {
		if (num > lurgest) {
			lurgest = num;
			
		}
	}
	System.out.println(lurgest);
}
}
