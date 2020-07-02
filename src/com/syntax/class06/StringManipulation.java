package com.syntax.class06;

public class StringManipulation {

	public static void main(String[] args) {
		// easiest way
		String str = "Hello! ";

		// long way
		String str2 = new String("HELLO! ");

		System.out.println(str + ": has " + str.length() + " characters");

		System.out.println(str.toUpperCase());

		// str did not change because String is immutable
		System.out.println(str + " in original");

		// str will be updated
		str = str.toLowerCase();

		System.out.println(str);

		if (str.equalsIgnoreCase(str2)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}

		String str3 = "Syntax";
		String str4 = "sy";
		boolean start = str3.startsWith(str4);
		System.out.println(str3 + " starts with " + str4 + ": " + start);

		System.out.println(str3.endsWith("tax"));

		// Method chaining
		System.out.println("str3.toUpperCase().endsWith(tax) -> " + str3.toUpperCase().endsWith("tax"));
		System.out.println("str3.toUpperCase().endsWith(TAX) -> " + str3.toUpperCase().endsWith("TAX"));

		char fifthCharacter = str3.charAt(4);
		System.out.println(fifthCharacter);

		System.out.println("------------------------");
		char[] charArray = str3.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		System.out.println("------------------------");
		// This is another way of printing the reverse
		for (int i = 1; i <= charArray.length; i++) {
			System.out.print(charArray[charArray.length - i]);
		}
		System.out.println();
		System.out.println("------------------------");

		int position = str3.indexOf("tax");
		System.out.println(position);
		System.out.println("========================");

		String example = "There is something here";
		int pos = example.indexOf("re", 6);
		System.out.println(pos);

		System.out.println("========================");

		String[] stringArray = example.split(" ");
		for (String s : stringArray) {
			System.out.println(s);
		}

	}

}
