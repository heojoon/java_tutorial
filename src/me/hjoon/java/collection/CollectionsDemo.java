package me.hjoon.java.collection;

import java.util.*;

class Computer implements Comparable{
	int serial;
	String owner;
	
	Computer(int serial, String owner){
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
	}
	public String toString() {
		return serial+" "+owner;
	}
}

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		
		Computer a = new Computer(500,"egoing");
		Computer b = new Computer(300,"leezche");
		Computer c = new Computer(100,"hjoon");
		
		computers.add(a);
		computers.add(b);
		computers.add(c);
		
//		computers.add(new Computer(500, "egoing"));
//		computers.add(new Computer(200, "leezche"));
//		computers.add(new Computer(133, "hjoon"));
		
		// 정렬 전 단계.
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		// 정렬.-----
		System.out.println("\nafter");
		
		Collections.sort(computers);
		
		i = computers.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
