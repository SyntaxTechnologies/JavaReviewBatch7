package com.syntax.class11;

public class HomeWork4 {

	public static void main(String[] args) {
		int[][] num = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}};
		int num1 = 0;
		for (int num2 = 0; num2 < num.length; num2++) {
			for(int num3 = 0; num3 <num[num2].length; num3++) {
				num1 +=  num[num2][num3];
				
			}
		}
System.out.println(num1);

System.out.println("--------------------------------------------------");

int [] a = {1,2,3,3,4,5,6,9};
int result = 0;

for (int b:a) {
	result+=b;}
	System.out.println(result);
}
	


} 
