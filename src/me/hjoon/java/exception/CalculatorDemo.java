package me.hjoon.java.exception;

class Calculator2{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	// 계산결과는 !!! 오류가 발생했습니다 !!!! :/ by zero
    	try {
    		System.out.print("계산결과는 ");
    		System.out.print(this.left/this.right);
    		System.out.print(" 입니다.");
    	} catch(Exception e) {
    		System.out.println("\n\ne.getMessage()\n"+e.getMessage());
    		System.out.println("\n\ne.toString()\n"+e.toString());
    		System.out.println("\n\ne.printStackTrace()");
    		e.printStackTrace();
    	}
    	System.out.println("Divide End");
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 0);
        c1.divide();
    }
}