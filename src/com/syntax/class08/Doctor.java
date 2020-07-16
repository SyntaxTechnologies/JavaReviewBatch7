package com.syntax.class08;

public class Doctor {
	public String name;
	public String specialty;
	public int licenseId;
	
	public Doctor() {
		
	}
	
	public Doctor(String name) {
		this.name = name;
	}

	public Doctor(String name, String specialty, int licenseId) {
		this(name);

		this.specialty = specialty;
		this.licenseId = licenseId;
	}

	public void checkUp(String name) {
		// to access the name of the doctor
		// we have to use this keyword
		System.out.println(
				"Doctor " + this.name + 
				" ordered blood test for patient " + name);
	}

	public void chargePatient() {
		System.out.println("Gets $200!");
	}

	public void displayInfo() {
		System.out.println(
				"Doctor " + name + 
				" with licenceId " + this.licenseId + 
				" is a " + this.specialty);
	}
}
