package com.score;

public class MTest {

	public static void main(String[] args) {
		Score lee= new Score();
		lee.setName("이순신");
		lee.setKor(85);
		lee.setEng(44);
		lee.setMath(100);
		
		Score hong = new Score ("홍길동",100,87,0);
		System.out.println(lee);
		//prntln이 lee 라는 이름을 가진 toString 을 리턴하게 되는것임. syso(lee.toString)
		System.out.println(hong);
		
	}
}
