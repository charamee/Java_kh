package com.test08;

public class Dog implements Animal {
	
	
	public void act() {
		System.out.println("핥는다");
	}

	@Override
	public void bark() {
		System.out.println("멍");
	}

	@Override
	public void feed() {
		System.out.println("뼈다귀를 먹는다");
	}
	
	

	

}
