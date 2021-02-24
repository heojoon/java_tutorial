package me.hjoon.java.polymorphism;

public class PolymorphismDemo3 {
	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A();
		obj.B();
		
		objI2.A();
		//objI2.B();
		
		//objI3.A();
		objI3.B();
	}
}
