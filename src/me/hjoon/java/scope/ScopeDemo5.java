package me.hjoon.java.scope;

public class ScopeDemo5 {
	static int i = 3;
	static int j = 3;
	
	
	public static void main(String[] args) {
		int i;
		for (i=0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("------"); 
		System.out.println(i);
		System.out.println("------");
		
		for (int j=0; j < 5; j++) {
			System.out.println(j);
		}
		System.out.println("------"); 
		System.out.println(j);
	}
}