package me.hjoon.java.object;

class Calculator2{
    static double PI = 3.14;
    // 클래스 변수 base가 추가 되었다.
    static int base = 0;

	int left, right;

	public void setOperands(int left, int right) {
	  	this.left = left;		// this.left 는 상단에 정의한 전역 변수 , left 는 지역변수의 left (this 는 Calculator 인스턴스 자신을 의미함)
	   	this.right = right;
	}
	 
	public void sum() {
	   	System.out.println(this.left+this.right + base);
	}

	public void avg() {
	   	System.out.println((this.left + this.right + base )/2);
	}
}

// 클래스 변수의 용도 
// 1. 인스턴스에 따라서 변하지 않는 값이 필요한 경우
// 2. 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우 
// 3. 값의 변경 사항을 모든 인스턴스가 공유해야 하는 경유 -> 클래스 변수를 재정의 하는 것. 


public class CalculatorDemo2 {

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 20);
		// 30 출력
		c1.sum();

		Calculator2 c2 = new Calculator2();
		c2.setOperands(20, 40);
		// 60 출력
		c2.sum();

		// 클래스 변수 base의 값을 10으로 지정했다.
		Calculator2.base = 10;

		// 40 출력
		c1.sum();

		// 70 출력
		c2.sum();

	}

}
