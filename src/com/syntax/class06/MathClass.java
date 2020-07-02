package com.syntax.class06;

public class MathClass {
	
	public static void main(String[] args) {
		Addition a = new Addition();
		
		a.add();
		
		int result1 = a.addWithResult();
		System.out.println(result1);
		
		a.addWithParameters(5, 6);
		
		int result2 = a.addWithParametersAndResult(7, 8);
		System.out.println(result2);
	}

}
