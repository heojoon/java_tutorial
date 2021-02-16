package me.hjoon.java.object;

public class CalculatorDemo1 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		System.out.println(c1.PI);

		Calculator c2 = new Calculator();
		System.out.println(c2.PI);

		System.out.println(Calculator.PI); // 클래스 변수를 직접 호출 가능
	}

}