package com.syntax.class09;
import java.util.Scanner;
public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many floors does have you hotel?");
		int floor  = scan.nextInt();
		System.out.println("How many rooms does have you hotel?");
		int room  = scan.nextInt();
		
		for (int b = 1; b <= floor; b++) {
			System.out.print("We are in floor " + b + " --> ");
			for (int c = 1; c <=room; c++)
			System.out.print(b + "." + c + ' ');{
		}
		System.out.println();
	}}

}
