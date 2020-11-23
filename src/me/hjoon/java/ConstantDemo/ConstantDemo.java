package me.hjoon.java.ConstantDemo;

public class ConstantDemo {

	public static void main(String[] args) {
		// 상수도 데이터 타입이 있다. 정수는 INT , 실수는 double 이다.
		float a = 2.2F;
		double b = 2.2;
		long c = 2147483648L;
		byte e = 100;
		short f = 200;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(f);
		
		// 자동 형 변환
		// 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용 된다.
		// byte -> short -> int -> long -> float -> double
		int a1 = 3;
		float b1 = 1.0F;
		double c1 = a1+ b1;
		
		System.out.println(c1);
		
		// 명시적 형 변환
		float q = (float)100.0;
		int w = (int)100.0F;

	}

}
