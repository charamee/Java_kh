package com.test08;

public class Cat implements Animal {

	public void ignore() {
		System.out.println("사람을 무시한다");
	}

	@Override
	public void bark() {
		System.out.println("애옭");
	}

	@Override
	public void feed() {
		System.out.println("생선을 먹는다.");
	}
}
