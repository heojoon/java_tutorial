package me.hjoon.java.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
/*
------------------------------------------------------------------------------------
String a = "Hello world";
String b = new String("Hello world");
���⼭ a == b �� false�� ������ ������ String ��ü�� ���ؼ� JVM�� �޸��Ҵ� ����� �ٸ��� �����Դϴ�.

String a = "Hello world"�� �Ҵ��ϰ� �Ǵ� ��쿡�� Heap�ȿ� �ִ� String Constant Pool������ �Ҵ��� �ǰԵȴ�. 
String b = new String("Hello world")�� �Ҵ��ϰ� �Ǵ� ��쿡�� Heap���� String Constant Pool������ �ƴ� Heap���� ��򰡿� �ϳ��� "Hello world"��� ��ü�� �Ҵ�

���⼭ a�� b��ü�� ������ ������ ����Ű���ִ� ��ü�� ���� �ٸ� ��ü�̱⶧���� a == b�� false�� ������ ���Դϴ�.

String�� ���� �߰����� ����...
String a = "Hello World";
String b = "Hello World";
�̷��� ������ �ϰԵǸ� a,b��ü�� SCP(String Constant Pool)���� Hello World�� ������ �� ��ü�� �Ҵ�� �� ������ �׷��� �ʽ��ϴ�. 
SCP������ ������ ���ڿ��� ���ؼ� �ϳ��� Hello World��ü�θ� �Ҵ�Ǹ� a�� b�� ������ ���۷����� ������ �Ǵ� ���Դϴ�.
------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------
==�� .equal�� ��������,

a == b �� ���
a�� b��� ������ ����? (�� ���� ���� ��ü) -> �ƴϿ�, a�� a�� b�� �ƴմϴ�.
a == a�� ��� true.

a.equal(b)�� ���
a�� �ִ� ���� b�� �ִ� ���� ����? -> ��, a�� ����ִ� ����, b�� ��� �ִ� ���� �����ϴ�.
------------------------------------------------------------------------------------
*/
        
	}

}
