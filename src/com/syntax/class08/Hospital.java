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

		System.out.println("---Creating a dermatologist---");
		Dermatologist derma1 = new Dermatologist("Ali", "Dermatologist", 234567, 9876);
		System.out.println("The name of dermatologist is " + derma1.name);
		derma1.displayInfo();
		derma1.chargePatient();

		derma1.applySkinTreatment();
		// this is not posible
		// d1.applySkinTreatment();

		// HW for Valerii
		// He has to add one property and one method for ENT
		// create a constructor that will set all the properties
		// Call the super constructor
	}

}
