package com.syntax.class13;

public class Car {
	//define car features
	String make;
	String model;
	String color;
	int year;
	int speed;
	
	
	// define behavior in a from of methods
	void drive() {
		System.out.println(make +" Car is drive");
	}
	void reverse () {
		System.out.println(make +" Car can reverse");
	}
	void transportPeople() {
		System.out.println(make +" Car can transport people");
	}
	void stop() {
		System.out.println(make +" Car will stop when press break");
		System.out.println(make +" Car STOP");
	}
	
	
}
