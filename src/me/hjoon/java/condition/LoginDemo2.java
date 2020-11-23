package me.hjoon.java.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
        String password = args[1];
        if (id.equals("hjoon")) {
            if (password.equals("1234")) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
 
        } else {
            System.out.println("wrong");
        }
	}

}
