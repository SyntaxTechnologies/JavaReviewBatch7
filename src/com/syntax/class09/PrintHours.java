package com.syntax.class09;

public class PrintHours {
public static void main(String[] args) {
	//print the clock
	//0.01
	//0.01
	//..
	//1.00
	//1.01
	//...
	//23.58
	//23.59
	
	for ( int h = 0; h< 24; h++) {
		System.out.println();
		for (int m = 0; m <= 60; m++) {
			if (m < 10) {
			System.out.println(h +":0" + m);}
			else {
				System.out.println(h + ":" + m);}
			for (int s = 1; s < 60; s++) {  
				if (s == 60)
					System.out.println(h + ":" + h + ":00");
				else {System.out.println(h + ":" + m +":" + s);}
				
			
			
//			for (s = 0; s < 60; s++) {
//				System.out.println(h + ":" + m + ":" + s);
//			}
				
	}
	
}
}
}}