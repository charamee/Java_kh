package com.test03;


//entends : class > class 상속
//implements : class > interface  상속
public class Cat implements Animal {

	@Override
	public void bark() {
	System.out.println("애올ㄺ");

	}

	@Override
	public void eat(String feed) {
		System.out.println("냥이가 "+feed+"먹는다.");


	}

}
