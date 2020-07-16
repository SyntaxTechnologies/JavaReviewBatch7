package com.syntax.class08;

public class Dermatologist extends Doctor {
	public int dermatolgyId;

	public Dermatologist(String name, String specialty, int licenseId, int dermatolgyId) {
		super(name, specialty, licenseId);
		this.dermatolgyId = dermatolgyId;
	}

	public void applySkinTreatment() {
		System.out.println("Applies some cream on patient's skin!");
	}

}
