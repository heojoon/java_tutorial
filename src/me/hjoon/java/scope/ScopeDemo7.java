package me.hjoon.java.scope;

class C {
    int v = 10;
	    
    void m() {
    	int v = 20;
        System.out.println(v); 
        System.out.println(this.v); // this : 인스턴스 자신을 의미 
    }
}
	 
	public class ScopeDemo7 {
	    public static void main(String[] args) {
	        C c1 = new C();
	        c1.m();
	    }
}
	