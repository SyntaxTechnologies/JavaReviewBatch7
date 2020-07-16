package com.syntax.class08;

public class Hospital {

	public static void main(String[] args) {

		Doctor d1 = new Doctor("John", "Family Doctor", 123456);
//		d1.name = "John";
//		d1.specialty = "Family Doctor";
//		d1.licenceId = 123456;

		d1.chargePatient();

		d1.displayInfo();
		d1.checkUp("Luis");

		// to access the name of the doctor from outside the object
		// we use the variable d1
//		System.out.println("Doctor's name is " + d1.name);
		
		Doctor d2 = new Doctor("Smith");
		d2.displayInfo();
		

	}

}
