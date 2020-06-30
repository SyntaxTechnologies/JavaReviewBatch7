package com.syntax.class08;

public class BreakAndContinue {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
		
		if (i == 4) {
		break;
		}
		System.out.println(i);
	}
	System.out.println("we are outside of the loop");
	System.out.println("-----------------------------------------");
for (int i = 1; i <= 10; i++) {
		
		if (i == 4) {
		continue;
		}
		System.out.println(i);
	}
}
}
