package me.hjoon.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		
		System.out.println("Print HashSet");
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(1);
		AL.add(2);
		AL.add(2);
		AL.add(2);
		AL.add(3);
		
		System.out.println("Print ArrayList");
		Iterator hi_AL = (Iterator) AL.iterator();
		while(hi_AL.hasNext()) {
			System.out.println(hi_AL.next());
		}
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);

		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		C.add(3);
		
		System.out.println(A.containsAll(B)); // false
		System.out.println(A.containsAll(C)); // true
	}

}
