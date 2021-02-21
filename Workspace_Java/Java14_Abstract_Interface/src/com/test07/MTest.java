package com.test07;

public class MTest {

	public static void main(String[] args) {
		
		MyProfile my = new MyProfile("차가람","010-7332-6233");//생성자 호출
		my.jobLoc("서울시 강남구");
		my.display();
	}
}
