package com.syntax.class09;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {
			System.out.println("other loop" );
			
			
			for (int j = 1; j <=2; j++) {
				System.out.println( "I = " + i +" J =" + j);
			}
		}
		
		

}}
