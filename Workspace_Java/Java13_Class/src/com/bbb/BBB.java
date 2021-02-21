package com.bbb;

import com.aaa.AAA;



//super class : 부모( 상속) this: 나 
public class BBB extends AAA {
	// extends 가 되어있을땐 부모 객체 AAA가 먼저 만들어지고 BBB (자식객체)가 생성됨.

	private int bcd;
	public BBB() { // 기본생성자 
		//super(); >> super 를 굳이 쓰지 않아도 AAA의 객체가 만들어짐 
		System.out.println("BBB 생성");
	}
	
	public BBB (int abc) {
		// 부모생성자 (param) 호출
		super (abc); // >> public AAA (int abc) 를 호출해서 abc에 15를 넣음 
		bcd = 10;
		System.out.println("BBB 생성 > abc : "+ abc);
		
		
	}
	
	public BBB(int abc, int bcd) {
		super (abc);
		this.bcd= bcd;
		System.out.printf("BBB 생성 > abc : %d, bcd : %d\n",abc,bcd);
	}
	
	public int getBcd() {
		return bcd;
	}
	public void setBcd(int bcd) {
		this.bcd=bcd;
		
	}
	public int getSum() {
		//int sum= super.getAbc()+this.getBcd();
		int sum = getAbc()+getBcd(); //위와 같은건데 super를 생략한것 . 부모님꺼 맘대로 쓴다 . 
		return sum;
	}
	@Override  // 재정의 : 똑같은 식으로 다른 값을 쓸거야? 
	public void prn() {
		System.out.println("BBB.prn()");
	}
}
