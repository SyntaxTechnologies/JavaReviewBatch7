package com.syntax.class15;

public class StringBufferDemo {
public static void main(String[] args) {
	

	StringBuffer  strBuffer = new StringBuffer("Hello");
	strBuffer.append(" friends");
	System.out.println(strBuffer);

	String str2 = "Hello";
	str2.concat(" friends");
	System.out.println(str2);
	
	
	
}
}
