package com.syntax.class15;

public class ReplaceFunction {
public static void main(String[] args) {
	
	String me = "I am a good tester";
	
	String str = "Hello";
	
	str = str.replace('e', 'E');
	System.out.println(str);
	
	me=me.replace("good", "great");	
	System.out.println(me);
	
	me=me.replace("I", "We");
	System.out.println(me);
	
	String fromApplication = "Phone number is 1234567890";

	//fromApplication = fromApplication.replaceAll("[A-Z]", "");
	//System.out.println(fromApplication);
	
	
	fromApplication = fromApplication.replaceAll("[A-z]", "").trim();
	System.out.println(fromApplication);
	System.out.println("NEW STRING " + fromApplication );
	
	String another ="Hello12345";
	another = another.replace("[A-Z]", "").replace("[a-z]", "");
	System.out.println(another);
	
		String anotherWay = "HellohgfYHHdshjkcxcfv89765467";
		anotherWay = anotherWay.replaceAll("[A-Za-z]", "");
		System.out.println();
		System.out.println(another);
	
		String mix1 = "hello =-=--==/;";
	
		mix1=mix1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(mix1);
	
}
}
