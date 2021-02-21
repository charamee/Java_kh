package com.test01;

public class MTest {

	public static void main(String[] args) {
		//Animal animal = new Animal(); > 객체 만들 수 없음 . 추상 class 의 추상 method를 가지기 때문 
		Animal cat= new Cat(); // Animal 부모 타입의 자식 cat 가능 
		Animal dog = new Dog();
		
		
		cat.bark();
		dog.bark();
		
		cat.eat("참치캔");
		dog.eat("뼈다귀");
				
		
		
		
	}
}
