package com.test02;

//추상클래스
public abstract class Animal {

	
	public Animal() {  
		System.out.print("동물 : ");
	}
	public abstract void bark(); //바디가 없는 메소드 
	public abstract void start(); //바디가 없는 메소드 
	public abstract void stop(); // 바디가 없는 메소드 >> 이거 3개 모두 상속받는 자식class에서 구현해야함 
	
	
}
