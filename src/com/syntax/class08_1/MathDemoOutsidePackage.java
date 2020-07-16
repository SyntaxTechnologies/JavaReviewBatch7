package com.syntax.class08_1;

import com.syntax.class08.Math;

public class MathDemoOutsidePackage extends Math {

	public static void main(String[] args) {

		int result = 0;

		// This method is accessed from everywhere
		// because it is public
		result = Math.add(4, 7);
		System.out.println("Addition result: " + result);

		// This method is accessed from outside package
		// because of inheritance
		result = Math.multiply(4, 6);
		System.out.println("Multiplication result: " + result);

		// this method cannot be accessed from outside package
		// result = Math.subtract(6, 10);
		// System.out.println("Subtraction result: " + result);

		// this method cannot be accessed from outside Math class
		// result = Math.divide(12, 5);
		// System.out.println("Division result: " + result);

		System.out.println("---Now let's test variables---");
		// First I have to create an object/instance
		Math m = new Math();
		m.name = "Math";

		// m.phone = "(123) 456-7890";
		// m.address = "Virginia, USA";

		// this variable cannot be accessed
		// because it is private
		// m.SSN = 123678907;

		MathDemoOutsidePackage m2 = new MathDemoOutsidePackage();
		m2.name = "Math";
		
		// this variable cannot be accessed
		// because it is default
		// m2.phone = "(123) 456-7890";
		
		m2.address = "Virginia, USA";

		// this variable cannot be accessed
		// because it is private
		// m2.SSN = 123678907;
	}

}
