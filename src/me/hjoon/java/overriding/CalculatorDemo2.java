package me.hjoon.java.overriding;

class SubstractionableCalculator2 extends Calculator {
	public void sum() {
		System.out.println("실행 결과는 "+(this.left + this.right)+"입니다.");
	}
	
	public int avg() {
		return super.avg(); 
	}

	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {

		SubstractionableCalculator2 c1 = new SubstractionableCalculator2();
		c1.setOprands(10, 20);
		c1.sum();
		System.out.println("평균 결과는 : " + c1.avg());
		c1.substract();
	}
}