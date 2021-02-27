package me.hjoon.java.reference;

public class ReferenceDemo3 {

	static void _value(int b) {
		b = 2;
	}
	public static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue, " + a);
	}
	
	static void _runReference1(A b){
		b = new A(2);
	}

	public static void runReference1() {
		A a = new A(1);
		_runReference1(a);
		System.out.println("runReference (a.id) : " + a.id);
		
	}

	static void _runReference2(A b){
		b.id = 2;
	}
	
	public static void runReference2() {
		A a = new A(1);
		_runReference2(a);
		System.out.println("runReference (a.id) : " + a.id);
	}

	public static void main(String[] args) {
		runValue();
		runReference1();
		runReference2();
	}

}
