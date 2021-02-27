package me.hjoon.java.generic;

class StudentInfo {
	public int grade;

	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person<T, S> {
	public T info;
	public S id;

	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}

	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		EmployeeInfo2 e = new EmployeeInfo2(1);
		Integer i = new Integer(1);
		// Person<EmployeeInfo,Integer> p1 = new Person<EmployeeInfo, Integer>(e,i);
		Person p1 = new Person(e, i);	// Data Type 을 자바에서 추축할 수 있기 때문에 생략 가능 
		// p1.<EmployeeInfo>printInfo(e); // 메소드에 적용 (아래 줄은 생략 가능 적용) 
		p1.printInfo(e);  
	}
}