package com.test02;

public class Cat extends Animal {

	public Cat() {
		System.out.println("냥이");
	}
	public void bark() {
		super.bark();//생략가능 
		System.out.println("애옭");
	}
}
