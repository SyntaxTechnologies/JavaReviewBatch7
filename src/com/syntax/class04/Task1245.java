package com.syntax.class04;

public class Task1245 {
public static void main(String[] args) {
	boolean hasDiplom = true;
	boolean isDegree = true;
	double gpa = 3;
	if (hasDiplom) { 
		System.out.println("Congratulation");
	} else {System.out.println("Get a degree");
	} if (isDegree) {
		if (gpa > 3.5) {
			System.out.println("You are eligible for sholarship");
		}else {
			System.out.println("you should have studied harder");}
		}
	}
}

