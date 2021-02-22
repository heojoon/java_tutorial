package me.hjoon.java.interfaces.example3;

// 하나의 클래스가 여러개의 인터페이스를 구현 할 수 있다.
interface I1{
    public void x();
}

interface I2{
	public void z();
}

class A implements I1, I2{
	public void x(){}
	public void z(){}	
}

// 인터페이스도 상속이 된다.
interface I3{
    public void x();
}

interface I4 extends I3{
	public void z();
}

class B implements I4{
	public void x(){}
	public void z(){}	
}

//인터페이스 맴버는 반드시 public 이다.
interface I5{
    // private void x();
    public void y();
    // default void z();
}
