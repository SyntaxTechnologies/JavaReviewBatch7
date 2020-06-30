package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {
	Car car1 = new Car();
	System.out.println("------Accesing methods from Car class using car1-----------");
	Car car = new	Car();
	car1.make="Tesla";
	car1.model="x";
	car1.color="red";
	car1.year=2020;
	car1.speed=200;
	System.out.println("Make of First car is " +car1.make + " model is " + car1.model);
	car1.drive();
	car1.reverse();
	car1.transportPeople();
	car1.stop();
	
	System.out.println("------Accesing methods from Car class using car2-----------");
	Car car2 = new Car();
	car2.make = "BMW";
	car2.model="M5";
	car2.color="blue";
	car2.year=2018;
	car2.speed=240;
	System.out.println("Make of second car is " +car2.make);
	
	car2.drive();
	car2.reverse();
	car2.transportPeople();
	System.out.println("------Accesing methods from Car class using car3-----------");
	Car car3 = new Car();
	car3.make="mersedes-benz";
	car3.model="c200";
	car3.color="white";
	car3.year=2012;
	car3.speed=201;
	System.out.println("Car is " + car3.make + "and car model is " + car3.model);
	
	car3.drive();
	car3.reverse();
	car3.transportPeople();
	
	System.out.println("------Accesing methods from Car class using car1-----------");
	Car car4 = new Car();
	car4.make="Mazda";
	car4.model="cx5";
	car4.color="white";
	car4.year=2020;
	car4.speed=160;
	System.out.println("Car is " + car4.make + " car speed is " + car4.speed);
	car4.drive();
	car4.reverse();
	car4.transportPeople();
	
	
	
	
	}
}
