package com.syntax.class02;
import java.util.Scanner;

import javax.management.monitor.StringMonitorMBean;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
public class StatementDemo {
	public static void main(String[] args) {
		
		
		System.out.print("Print your Firstname:");
		Scanner scn = new Scanner(System.in);
		
		

		
		String FirstName = scn.nextLine();
		System.out.println("your name is  : " + FirstName);
		System.out.print("print lastname");
		String LastName = scn.nextLine();
		System.out.println("Your lastname is " + LastName);
		System.out.println(FirstName + LastName);
		
}
}
