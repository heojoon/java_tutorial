package me.hjoon.java.scope;

public class ScopeDemo2 {
	static int i;	// 전역변수 
	
	static void a() {
		i = 0;
	}
	
	public static void main(String[] args) {
		for ( int i =0; i < 5; i++) {  // for 문 안에 int i , 즉 for 문 에서 선언한 변수 i 는 for 문에 끝나면 사라짐.
			a(); 
			System.out.println(i);
		}
		System.out.println(i);  // for문이 끝나고 i 를 호출하면 전역변수 i 가 호출됨.
	}

}