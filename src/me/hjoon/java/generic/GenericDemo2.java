package me.hjoon.java.generic;

//abstract class Info{
//	public abstract int getLevel();
//}

interface Info{
	int getLevel();
}

class EmployeeInfo2 implements Info {
	public int rank;
	EmployeeInfo2(int rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}

class Person2<T extends Info> {	// 부모가 누구냐인지만 확인 역할: extends
	public T info;
	Person2(T info) {
		this.info = info;
	}
}

public class GenericDemo2 {
	public static void main(String[] args) {
		EmployeeInfo2 ei = new EmployeeInfo2(1);
        Person2 p1 = new Person2(ei);
        //Person<String> p2 = new Person<String>("부장");
        System.out.println(p1);
	}
}