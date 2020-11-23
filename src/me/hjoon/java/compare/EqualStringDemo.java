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
여기서 a == b 가 false로 나오는 이유는 String 객체에 대해서 JVM의 메모리할당 방식이 다르기 때문입니다.

String a = "Hello world"로 할당하게 되는 경우에는 Heap안에 있는 String Constant Pool영역에 할당이 되게된다. 
String b = new String("Hello world")로 할당하게 되는 경우에는 Heap내의 String Constant Pool영역이 아닌 Heap내의 어딘가에 하나의 "Hello world"라는 객체로 할당

여기서 a와 b객체의 내용은 같지만 가르키고있는 객체가 각각 다른 객체이기때문에 a == b는 false가 나오는 것입니다.

String에 대한 추가적인 내용...
String a = "Hello World";
String b = "Hello World";
이렇게 선언을 하게되면 a,b객체는 SCP(String Constant Pool)내에 Hello World로 동일한 두 객체가 할당될 것 같지만 그렇지 않습니다. 
SCP내에는 동일한 문자열에 대해서 하나의 Hello World객체로만 할당되며 a와 b는 동일한 레퍼런스를 가지게 되는 것입니다.
------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------
==와 .equal의 차이점은,

a == b 의 경우
a와 b라는 변수가 같냐? (값 말고 변수 자체) -> 아니오, a는 a지 b가 아닙니다.
a == a의 경우 true.

a.equal(b)의 경우
a에 있는 값과 b에 있는 값이 같냐? -> 예, a에 들어있는 값과, b에 들어 있는 값은 같습니다.
------------------------------------------------------------------------------------
*/
        
	}

}
