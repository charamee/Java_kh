package com.test04;

public abstract class Animal {
	
	

	public abstract void bark(); // 바디가 없는 메소드 자식객체에서 메소드 구현해야함 
	
	public void eat (String feed) {
		System.out.println(feed + "먹는다.");
	}
}
