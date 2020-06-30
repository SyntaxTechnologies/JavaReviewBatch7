package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		 int a = 7;
		 int b = 10;
		 
		 System.out.println(3 > 4); // false
		 System.out.println(a < b); // true
		 System.out.println( a == b); // false
		 System.out.println(a != b); // true

		 System.out.println("*********************");
		 double i = 10.78;
		 double j = 10.78;
		 boolean result1 = i >j; // true
		 System.out.println(result1);
		 
		 boolean result2 = 1 == j;
		 System.out.println(result2);
		 
		 boolean result3 = i != j;
		 System.out.println(result3);
		 System.out.println("***************");
		 boolean result4 = i >= j;
		 System.out.println(result4);
		 System.out.println("********");
		 boolean result5 = i <= j ;
		 System.out.println(result5);
		 
		 
		 
	}

}
