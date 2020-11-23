package me.hjoon.java.variables;

public class StringDemo {

	public static void main(String[] args) {
		// 문자열
		String first = "coding"; 
		System.out.println(first+" "+"everybody");
		
		String a, b , c;
		a = "I remember";
		b = " ";
		c = "having a social gathering";
		System.out.println(a+b+c);
		
		// 변수가 없다면..
		System.out.println(100 + 10);
		System.out.println((100 + 10) / 10);
		System.out.println(((100 + 10) / 10) - 10);
		System.out.println((((100 + 10) / 10) - 10) * 10);
		
		int x = 200;
		System.out.println(x + 10);
		System.out.println((x+ 10) / 10);
		System.out.println(((x + 10) / 10) - 10);
		System.out.println((((x + 10) / 10) - 10) * 10);
	}

}
