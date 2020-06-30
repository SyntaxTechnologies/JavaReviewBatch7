package com.syntax.class11;

public class Retriev {
public static void main(String[] args) {
	String [] [] months = {
			{"December", "January", "February"},
			{"March", "April", "May"},
			{"June", "July", "August"},
			{"September", "October", "November"}
	};
	
	int seasons = months.length;
	System.out.println(seasons + " seasons");// how many season
	
	int winterLength = months[0].length;// how many elements
	System.out.println(winterLength + " month in winter or in row 0");
	
	int lastRowSize = months[3].length;
	System.out.println(lastRowSize);
	
	int lastROWsize2 = months[seasons - 1].length;
	 for( int i = 0; i < months.length; i++) {
		 for (int j = 0; j < months[i].length; j++) {
			 System.out.println(months[i][j]);
		 }
	 }
	
	
	
	
	
}
}
