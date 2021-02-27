package me.hjoon.java.exception;

class DivideException extends RuntimeException {
	DivideException() {
		super();
	}
	DivideException(String message) {
		super(message);
	}
}

class DivideException2 extends Exception {
	DivideException2() {
		super();
	}
	DivideException2(String message) {
		super(message);
	}
}

class DivideException3 extends Exception {
	public int left, right;

	DivideException3() {
		super();
	}
	DivideException3(String message){
		super(message);
	}
	DivideException3(String message, int left, int right) {
		super(message);
		this.left = left;
		this.right = right;
	}
}

class CalculatorEx2 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		if (this.right == 0) {
			throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
		}
		System.out.println(this.left / this.right);
	}

	public void divide2() {
		try {
			if (right == 0) {
				throw new DivideException2("0으로 나눌수 없음.");
			}
			System.out.println(this.left / this.right);
		} catch (DivideException2 e2) {
			e2.printStackTrace();
			// System.out.println(e2.getMessage());
		}
	}

	public void divide3() throws DivideException3 {
		if (right == 0) {
			//throw new DivideException3("0으로 못 나눈다고!!");
			throw new DivideException3("0으로 못 나눈다고!!",this.left , this.right);
		} else {
			System.out.println(this.left / this.right);
		}
	}
}

public class CalculatorDemoException2 {

	public static void main(String[] args) {
		CalculatorEx2 c1 = new CalculatorEx2();
		c1.setOprands(10, 0);
		// c1.divide();
		// c1.divide2();
		try {
			c1.divide3();
		} catch (DivideException3 e) {
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}

}
