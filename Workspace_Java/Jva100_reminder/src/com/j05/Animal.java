package com.j05;

public class Animal {
	
	private String kind;
	private int age;
	
	public Animal() {
	
	}
	//생성자를 하나라도 만들면 기본생성자를 제공하지 않는다 ! 
	
	public Animal(String kind, int age) { //생성자 : 필드 초기화
		this.kind=kind; //
		this.age=age;
	}
	public String getkind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public void bark(String bark) {
		System.out.println("울음소리: "+bark);
	}

}
