package com.syntax.class11;

public class Repl2 {
	public static void main(String[] args)
	{
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
		};double rows = a.length;
		double cols =a[0].length;
		for(int b = 0; b <rows; b++) {
			double sumRow = 0;
			for (int c=0; c<cols; c++) {
				
				sumRow = sumRow + a[b][c];
			}
			System.out.println(sumRow);
			
		}
		}}
	
		
		
	
	
		