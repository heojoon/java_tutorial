package me.hjoon.java.object;

class CalculatorV {
	int left, right;
	
	public CalculatorV(int left,int right) {
		this.left = left;
	   	this.right = right;
	}
		 
	public void sum() {
	   	System.out.println(this.left+this.right);
	}

	public void avg() {
	   	System.out.println((this.left + this.right)/2);
	}
}

public class CalculatorDemo5 {

	public static void main(String[] args) {

		CalculatorV c1 = new CalculatorV(20,40);
		c1.sum();
		c1.avg();
	}

}