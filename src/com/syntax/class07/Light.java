package com.syntax.class07;
import java.util.Scanner;
public class Light {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("The wall switch is on? (Yes or No)");
		String light = scan.nextLine();
		if (light.equalsIgnoreCase("no")){
			 System.out.println("ALL OFF");}
			
		else if (light.equalsIgnoreCase("yes")) {
		  System.out.println("which speed  on 1,2,3 or 0");}
			int speed = scan.nextInt();
		  System.out.println("On the lamp switch ON ore OFF?");
		  Scanner scan2 = new Scanner(System.in);
		  String light2 = scan2.nextLine();
		
			if ((light.equalsIgnoreCase("yes"))  && speed == 1 && (light2.equalsIgnoreCase("on"))){
				System.err.println("Lamp on and fen on power1(((((((!!!");}
			else if ((light.equalsIgnoreCase("yes")) && speed == 2 && (light2.equalsIgnoreCase("on"))){
				System.out.println("Lamp on and fen on power2 . Best Speed!!!");}
			else if ((light.equalsIgnoreCase("yes")) && speed == 3 && (light2.equalsIgnoreCase("on"))) {
				System.out.println("Lamp on and fen on power2 Very fast!!!");}
			else if ((light.equalsIgnoreCase("yes")) && speed == 0 && (light2.equalsIgnoreCase("on")))	{
				System.out.println("Lamp on but fen OFF ((((");}
			else if ((light.equalsIgnoreCase("yes")) && speed == 1 && (light2.equalsIgnoreCase("off"))) {
				System.err.println( "only fen speed1(((((");}
			else if ((light.equalsIgnoreCase("yes")) && speed == 2 && (light2.equalsIgnoreCase("off"))) {
				System.out.println("only fen speed2");}
			else if ((light.equalsIgnoreCase("yes")) && speed == 3 && (light2.equalsIgnoreCase("off"))) {
				System.out.println("only fen speed3");}
			
			}
		}
			
	
			
			

	


