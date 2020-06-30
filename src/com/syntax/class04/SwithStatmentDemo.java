package com.syntax.class04;

public class SwithStatmentDemo {

	public static void main(String[] args) {

		/*
		 * a switch statement in java, it allows us to choose among multiple 
		 * or several alternative/option
		 */
		String browser="chrome";
		
		switch(browser) {
		
		case "chrome":
			System.out.println("Lunching chrome browser");
			break;
		case "firefox":
			System.out.println("Lunching firefox browser");
			break;
		case "ie":
			System.out.println("Lunching ie browser");
			break;
		
		default:
			System.err.println("UnSupported browser. Supported browsers are, chrome, firefox, ie");
		
		
		}
		
		
		
	}

}
