package me.hjoon.java.Inheritance;

class SubstractionableCalculator2 extends Calculator {
	public SubstractionableCalculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo4 {

	public static void main(String[] args) {
		SubstractionableCalculator2 c1 = new SubstractionableCalculator2(10,20);		
		c1.sum();
		c1.avg();
		c1.substract();

		SubstractionableCalculator2 c2 = new SubstractionableCalculator2(10,20);		
		c2.sum();
		c2.avg();
		c2.substract();
		
	}

}
