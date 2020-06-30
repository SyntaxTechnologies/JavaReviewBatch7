package com.syntax.class12;

public class Task {

	public static void main(String[] args) {
		
//		String [][] Food = {{"pelmeni", "borch", "salo"},
//				            {"plow", "samsa","lavash"}};
//		for (String food2[]:Food) {
//			for( String types:food2) {
//				System.out.print(types + " ");
//				System.out.println();}}
		int[][]numbers = {
				{10,23,56,47},
				{33,668,89},
				{1,9,0}};
	int calk = 0;
		for (int i = 0; i < numbers.length; i++ ) {
			for (int j = 0; j < numbers[i].length; j++) {
				
			if (numbers[i][j]%2 != 0) {
			calk +=	numbers[i][j];
			}}
			System.out.println(calk);}
		
	}
		
	

}
