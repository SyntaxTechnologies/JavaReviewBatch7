package com.syntax.class14;
import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User name");
		String UserName = scan.nextLine();
		System.out.println("Enter the password");
		String Password  = scan.nextLine();
		
		
		System.out.println("Please confirm your password");
		String confirmPassword = scan.nextLine();
		
		if (UserName.isEmpty() && Password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");}
		else if (Password.length()< 8){
			System.out.println("Password is to short");}
		else if  (Password.contains(UserName)) {
			System.out.println("Password cannot contain UserName");}
		 else if (!Password.equals(confirmPassword)) {
			System.out.println("Password do not match");}
		 else { System.out.println("Your userName and password have been created");
		
		
		}}}
		
		
		
		
		
		
	


