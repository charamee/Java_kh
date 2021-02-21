package com.test07;

public class Profile {

	
	private String name; 
	private String phone;
	
	public Profile(String name, String phone) { // 파라미터 2개짜리 생성자 
		this.name=name; // myprofile에서 값 두개 받아서 필드 초기화 
		this.phone=phone;
	}
	
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("번호 : "+phone);
}
}
