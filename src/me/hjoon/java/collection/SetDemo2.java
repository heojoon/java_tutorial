package me.hjoon.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
				
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);

		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		  
		System.out.println(A.containsAll(B)); // false B는 A의 부분집합이 아니다.
		System.out.println(A.containsAll(C)); // true C는 A의 부분 집합이다.
		
		A.addAll(B);	// A와 B를 합친다. -> 합집합
		A.retainAll(B);	// A도 있고 B도 있는 값 -> 교집합  
		A.removeAll(B); // A에서 B를 뺀 값 -> 차집합. 
		
		
	}

}
