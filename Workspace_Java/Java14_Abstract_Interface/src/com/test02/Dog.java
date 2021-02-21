package com.test02;

public class Dog extends Animal {

	public Dog() {
		System.out.println("멍멍이");
	}
	@Override
	public void start() {
		System.out.println("멍멍이가 토돗토돗 걷는다.");

	}

	@Override
	public void stop() {
		System.out.println("멍멍이가 멈췄다.");

	}
	@Override
	public void bark() {
		System.out.println("왕왕아ㅗㄹ아ㅗㄹ왈아ㅗㄹ아로아왈! ");
		
	}

}
