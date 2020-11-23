package me.hjoon.java.condition;

public class LoginDemo {
	public static void main(String[] args) {
		String id = args[0];
		if(id.equals("hjoon")){
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}

