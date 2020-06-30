package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		
		String java = "Java is the best programing langv in IT";
		java = java.replaceAll(" ", "");
		System.out.println(java);
		
		
		String java2 = "ggiugiug 86868 69*()@@!!";
		java2=java2.replaceAll("[^A-Za-z]", "");
		System.out.println(java2.length());
		
		
		
		String a = "1.Is it saturday? 2.Is it raining? 3.Do we have a Java class today?";
		
		String [] b =  a.split("[0-9]");
		
				int num = b.length;
			
		System.out.println(num);
		
		
		
		
		
	}

}
