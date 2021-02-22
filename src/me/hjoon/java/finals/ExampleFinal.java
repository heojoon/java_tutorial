package me.hjoon.java.finals;

//final 메소드는 final 변수 만큼 사용 빈도가 높지는 않다. 아래의 코드는 final 메소드 b를 상속하려하기 때문에 오류가 발생한다.


class A{
	final void b() {}
}

/**
class B extends A{
	void b() {}
}
**/

//아래 코드는 final 클래스를 상속하려하고 있다. 따라서 오류가 발생한다.

final class C{
	final void b() {}
}

//class D extends C{}




public class ExampleFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
