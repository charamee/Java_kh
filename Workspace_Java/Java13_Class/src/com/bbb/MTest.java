package com.bbb;

import com.aaa.AAA;

public class MTest {

	
	public static void main(String[] args) {
		// type 변수 = 값;
		// type 변수 = new 생성자();
		AAA myA = new AAA(); //기본생성자 호출하는법인가? // AAA라는 생성자가 new 와 만나면 객체가 만들어지는 것 
		//consol 창에 AAA생성 
		
		//참조타입은 객체를 만드는데 그 객체를 만드는것이 new 생성자 
		myA.prn(); // prn 메서드 호출 
		
		AAA paramA = new AAA(10); //파라미터 한개짜리 aaa생성자 에 10을 넣어줌  
		paramA.prn();
		System.out.println("abc :" + paramA.getAbc()); // get Abc 값을 가져오자 
		paramA.setAbc(100); // set 값을 넣어줄게(100)으로 넣어줄거야  
		System.out.println("abc :"+paramA.getAbc());// get Abc 값을 가져오자
		System.out.println("-----------");
		BBB b1 = new BBB();
		b1.setAbc(10);
		b1.setBcd(20);
		System.out.println(b1.getSum());
		
		BBB b2 = new BBB(15);// 파라미터 한개짜리 BBB로 가 
		System.out.println(b2.getSum());
		
		BBB b3 = new BBB (20,50);
		System.out.println(b3.getSum());
		
		System.out.println("----------------------------------------");
		
		AAA a1 = new AAA(); // consol창에 AAA생성 
		AAA a2 = new BBB();// consol 창에 AAA생성, BBB생성 / 부모 타입으로 자식 객체 받음 /a2의 타입은 AAA 
		//BBB a3 = new AAA(); // 자식 타입으로 부모 객체 못 받음 
		
		a1.prn();
		a2.prn();//부모의 메소드를 통해 자식 메소드가 호출된다. 
		//a2.getBcd(); a2의 타입이 AAA이기 때문에 쓸수 없음 
		((BBB)a2).getBcd();
		
	}
}
