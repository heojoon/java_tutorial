package me.hjoon.java.collection;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		// arrayObj[2] = "three"; 오류가 발생한다.
		for(int i=0; i<arrayObj.length; i++){
			System.out.println(arrayObj[i]);
		}
		
		//ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("one");
		al.add("two");
		al.add("three");
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
		// value 변수에 형변환하여 데이터 저장 
		// ArrayList는 add 로 데이터를 받을 때 Object 데이터 타입으로 받음.
		for(int i=0; i<al.size(); i++){
			//String value = (String)al.get(i);
			String value = al.get(i); // 재네릭을 사용하여 형변환을 하지 않고 사용.
			System.out.println(value);
		}
		
		
	}

}