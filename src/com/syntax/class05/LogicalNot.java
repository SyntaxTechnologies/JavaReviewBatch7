package com.syntax.class05;

public class LogicalNot {
		public static void main(String[] args) {
				//boolean b1 = !true;
				//System.out.println(b1);
				//boolean b2 = !false;
				//System.out.println(b2);
				
				//boolean cold = true 
				//		if (!cold) {
				//	System.out.println(1);}
				//		else { System.out.println(2);}
				//System.out.println("------------------------");
				////// 11111111
				int day = 5;
				if (day != 1 && day != 5 ) {
					System.out.println("we hawe class");
				} else { System.out.println("sleeping");}
				//222222222
				if (!(day == 1) && !(day == 5)) {
					System.out.println("class");
				}else {System.out.println("sleeping");}
				
				////3333 
				if (!(day == 1 || day == 5)) {
					System.out.println("class");
				}else {System.out.println("sleeping");}
				 ///////4444
				boolean isRaining = true;
				 if (!isRaining) { 
					 System.out.println("no ambrella");}
				 else {System.out.println("ambrella");}
				 }}
				
				
				
				


