package me.hjoon.java.ConstantDemo;

public class ConstantDemo {

	public static void main(String[] args) {
		// ����� ������ Ÿ���� �ִ�. ������ INT , �Ǽ��� double �̴�.
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
		
		// �ڵ� �� ��ȯ
		// ǥ�������� ���� ������ Ÿ�Կ��� ���� ������ Ÿ�������� ��ȯ�� ��� �ȴ�.
		// byte -> short -> int -> long -> float -> double
		int a1 = 3;
		float b1 = 1.0F;
		double c1 = a1+ b1;
		
		System.out.println(c1);
		
		// ����� �� ��ȯ
		float q = (float)100.0;
		int w = (int)100.0F;

	}

}
