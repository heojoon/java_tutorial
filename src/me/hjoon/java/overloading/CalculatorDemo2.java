package me.hjoon.java.overloading;

// 보충수업 
class arrayCalculator {
    int[] oprands;
    
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
		System.out.println("매개변수 갯수 :"+ this.oprands.length);
		for (int value : this.oprands) {
			System.out.println(value);
		}
	}
	
	public void sum() {
		int total = 0 ;
		for (int value : this.oprands) {
			total += value;
		}
		System.out.println("덧셈 결과 :"+(total));
	}

	public void avg() {
		int total = 0 ;
		for (int value : this.oprands) {
			total += value;
		}
		System.out.println("평균 결과 :"+(total/this.oprands.length));
	}
}

public class CalculatorDemo2 {
	public static void main(String[] args) {

		arrayCalculator c1 = new arrayCalculator();
		c1.setOprands(new int[] {10,20});
		c1.sum();
		c1.avg();
				
		c1.setOprands(new int[] {10,20,30,40});
		c1.sum();
		c1.avg();
	}
}