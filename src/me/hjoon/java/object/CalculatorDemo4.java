package me.hjoon.java.object;

class Calculator{
    static double PI = 3.14;

	int left, right;

	public void setOperands(int left, int right) {
	  	this.left = left;		// this.left 는 상단에 정의한 전역 변수 , left 는 지역변수의 left (this 는 Calculator 인스턴스 자신을 의미함)
	   	this.right = right;
	}
	 
	public void sum() {
	   	System.out.println(this.left+this.right);
	}

	public void avg() {
	   	System.out.println((this.left+this.right)/2);
	}
}

// 클래스 : 설계도 , 인스턴스(객체) : 제품(프로그램)  ...... 사용자 장의 데이터타입을 만든다.
// 객체는 상태(변수) 와 행위(메소드) 로 이루어져 있다.
// - 상태 : 객체(인스턴스)에 변수=입력값을 대입 
// - 행위 : 객체(인스턴스)에  메소스를 실

public class CalculatorDemo4 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
	}
}
