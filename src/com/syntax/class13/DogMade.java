package com.syntax.class13;

public class DogMade {
public static void main(String[] args) {
	
	Dog dogy1 = new Dog();
	dogy1.name = "Charly";
	dogy1.color = "grey";
	dogy1.age = 13;
	
	System.out.println("The name of dog is " + dogy1.name + " his color is " + dogy1.color + " and age is " +dogy1.age);
	dogy1.findsDrags();
	dogy1.jamp();
	dogy1.doesntStink();
	
	Dog dogy2 = new Dog();
	dogy2.name = "Borz";
	dogy2.color = "white";
	dogy2.age = 3;
	System.out.println("The name of dog is " + dogy2.name + " his color is " + dogy2.color + " and age is " +dogy2.age);
	dogy2.findsDrags();
	dogy2.jamp();
	dogy2.doesntStink();
	
	
			
	
	
	
	
	
	
	
}
}
