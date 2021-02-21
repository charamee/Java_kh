package com.test05;

public class Mtest {

	public static void main(String[] args) {
		
		//School calss에 만들어 놓은 1번 2번 3번 메소드를 호출하여 console 에 출력하자 
		School.namePrn("차가람");
		int age=School.getAge();
		System.out.println(age+"세");
		
		//non static 호출방법 : class 변수 = new class (); 변수. 메소드 (값);
		School kh=new School();
		kh.addrPrn("부천시");
		
	}
}
