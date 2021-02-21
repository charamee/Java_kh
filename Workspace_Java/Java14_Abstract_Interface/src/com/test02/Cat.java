package com.test02;

public class Cat extends Animal {

	public Cat() {
		System.out.println("냥이");
	}
	@Override
	public void start() {
		System.out.println("냥이가 사뿐사뿐 걷는다.");

	}

	@Override
	public void stop() {
		System.out.println("냥이가 고장났다. ");

	}
	@Override
	public void bark() {
		System.out.println("애오오옭--");
		
	}

}
