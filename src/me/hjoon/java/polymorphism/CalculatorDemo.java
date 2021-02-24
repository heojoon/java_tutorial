package me.hjoon.java.polymorphism;

abstract class Calculator{
    int left, right;
    
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();  
    public abstract void avg();
    public void run(){
    	sum();
    	avg();
    }
}
class CalculatorDecoPlus extends Calculator {
	public void sum(){
		System.out.println("+ sum :"+_sum());
	}
	public void avg(){
		System.out.println("+ avg :"+(this.left+this.right)/2);
	}
	public void divid() {
		System.out.println("+ avg :"+(this.left / this.right));
	}
} 
class CalculatorDecoMinus extends Calculator {
	public void sum(){
		System.out.println("- sum :"+_sum());
	}
	public void avg(){
		System.out.println("- avg :"+(this.left+this.right)/2);
	}
	public void divid() {
		System.out.println("+ avg :"+(this.left / this.right));	
	}
} 

public class CalculatorDemo {
	public static void excute(Calculator cal) {
		System.out.println("실행결과");
		cal.run();
	}
    public static void main(String[] args) { 
    	Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(20, 10);
        // c1.divid();
 
        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(20, 10);
        
        excute(c1);
        excute(c2);
    }
  
}
