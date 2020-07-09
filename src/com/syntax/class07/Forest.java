package com.syntax.class07;

public class Forest {

	public static void main(String[] args) {
		Bear b1 = new Bear();
		b1.name = "Bobby";
		b1.age++;
		Bear.count++;

		Bear b2 = new Bear();
		b2.name = "Baby";
		b2.age++;
		Bear.count++;

		Bear b22 = new Bear();
		b22.name = "Baba";
		b22.age++;
		Bear.count++;

		Wolf w1 = new Wolf();
		w1.name = "Wolfy";
		Wolf.count++;

		Wolf w11 = new Wolf();
		w11.name = "cucumber";
		Wolf.count++;

		System.out.println("In the forest:");
		System.out.println("There are " + Bear.count + " bears");
		System.out.println("There are " + Wolf.count + " wolves");

		System.out.println(b22.name + " is " + b22.age + " years old");
		// HW: Create a class of Chicken
		// Create a couple of chicken objects
		// Print the number of chickens

	}

}
