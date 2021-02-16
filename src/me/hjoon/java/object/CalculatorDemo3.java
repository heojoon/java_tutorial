package me.hjoon.java.object;

class Calculator3{
	 
    public static void sum(int left, int right){
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right){
		System.out.println((left+right)/2);
	}
}


public class CalculatorDemo3 {

	 public static void avg(int left, int right) {
	        System.out.println((left + right) / 2);
	    }
	 
	    public static void sum(int left, int right) {
	        System.out.println(left + right);
	    }
	 
	    public static void main(String[] args) {
	        int left, right;
	 
	        left = 10;
	        right = 20;
	 
	        sum(left, right); 
	        avg(left, right);
	 
	        left = 20;
	        right = 40;
	 
	        sum(left, right);
	        avg(left, right);
	    
	        System.out.println("## Class Method Example ##");
	    
	        Calculator3.sum(10, 20);
	        Calculator3.avg(10, 20);
			
	        Calculator3.sum(20, 40);
	        Calculator3.avg(20, 40);
	    }
}