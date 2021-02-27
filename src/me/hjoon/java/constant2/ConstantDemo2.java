package me.hjoon.java.constant2;

//interface FRUIT {
//	int APPLE = 1, PEACH = 2, BANANA = 3;
//}
//interface COMPANY {
//int GOOGLE = 1, APPLE = 2, ORACLE = 3;
//}

//class Fruit {
//	public static final Fruit APPLE = new Fruit();
//	public static final Fruit PEACH = new Fruit();
//	public static final Fruit BANANA = new Fruit();
//}

//class Company {
//	public static final Company APPLE = new Company();
//	public static final Company PEACH = new Company();
//	public static final Company BANANA = new Company();
//}

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");

	public String color;

	public String getColor() {
		return this.color;
	}

	Fruit(String color) {
		System.out.println("Call Constructor " + this);
		this.color = color;
	}
}

enum Company {
	GOOGLE,APPLE,ORACLE
}



public class ConstantDemo2 {

	public static void main(String[] args) {

//		if (Fruit.APPLE == Company.APPLE)
//			System.out.println("애플이 같습니다!?");

//		Fruit type = Fruit.APPLE;
		
		for(Fruit f : Fruit.values()) {
			System.out.println("in the enum Array : "+f);
		}
		
		Fruit type = Fruit.BANANA;
		switch (type) {
		case APPLE:
			System.out.println(" - Seleted : "+type);
			System.out.println(57 + " kcal , color : " + Fruit.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(" - Seleted : "+type);
			System.out.println(34 + " kcal , color : " + type.getColor());
			break;
		case BANANA:
			System.out.println(" - Seleted : "+type);
			System.out.println(93 + " kcal , color : " + type.getColor());
			break;
		}
	}
}