package me.hjoon.java.scope;

public class ScopeDemo4 {
	static String title;
	
	static void a() {
		title = "coding everybody";
	}
	
	public static void main(String[] args) {
		a();
		System.out.println(title);  
	}

}