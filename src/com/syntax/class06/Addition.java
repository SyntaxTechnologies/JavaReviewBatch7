package com.syntax.class06;

public class Addition {

	//A method with no parameters AND no return type
	public void add() {
		int a = 3;
		int b = 4;
		int res = a + b;
	}
	
	//A method with no parameters AND with return type
	public int addWithResult() {
		int a = 3;
		int b = 4;
		int res = a + b;
		return res;
	}
	
	//A method with parameters AND no return type
	public void addWithParameters(int num1, int num2) {
		int result = num1 + num2;
	}
	
	//A method with parameters AND return type
	public int addWithParametersAndResult(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

}
