package com.test04;

public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("애-옭");

	}
	
	public void eat (String feed) {
		System.out.println("냥이가"+feed+"먹는다.");
	}

}
