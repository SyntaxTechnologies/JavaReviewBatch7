package com.syntax.class08;

public class Math {
	public String name;
	String phone;
	protected String address;
	private int SSN;

	// This method can be accessed from everywhere in the project
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	// This method can be accessed from inside the package and from everywhere
	// through
	// inheritance
	protected static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	// default, when we don't have an access modifier
	// This method can be accessed from inside the package
	static int subtract(int a, int b) {
		return a - b;
	}

	// This method can be accessed from inside the class
	private static int divide(int y, int z) {
		if (z == 0) {
			return -1;
		}

		return y / z;
	}

	public static void main(String[] args) {

		int result = 0;

		// I don't need to specify Math.
		result = add(4, 7);
		System.out.println("Addition result: " + result);

		result = multiply(4, 6);
		System.out.println("Multiplication result: " + result);

		result = subtract(6, 10);
		System.out.println("Subtraction result: " + result);

		result = divide(12, 5);
		System.out.println("Division result: " + result);

		System.out.println("---Now let's test variables---");
		//First I have to create an object/instance
		Math m = new Math();
		m.name = "Math";
		m.phone = "(123) 456-7890";
		m.address = "Virginia, USA";
		m.SSN = 123678907;
	}
}
