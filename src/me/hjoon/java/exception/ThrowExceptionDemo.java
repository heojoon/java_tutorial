package me.hjoon.java.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
	String filename;
	
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader(filename));
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C {
	String filename;
	void run() throws FileNotFoundException, IOException {
		B b = new B();
		b.filename = filename;
		b.run();	
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		String filename = "out.txt";
		C c = new C();
		c.filename = filename;
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println(filename+"파일이 필요합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}