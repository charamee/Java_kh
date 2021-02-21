package com.test02;

public class Dog extends Animal {

	public Dog() {
		System.out.println("멍멍이");
		
	}
	
	public void bark () { // 부모의 bark메소드와 똑같은 형태임 >> override 재정의
		super.bark(); // 부모의 bark 메소드 호출 
		System.out.println("멍멍");
	}
}
