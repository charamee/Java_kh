package com.singleton;

//singleton pattern : 메모리(heap영역)에 객체를 한번만 생성 
public class Singleton {

	
	//2. 객체를 확인할 주소(reference)변수 선언
	private static Singleton singleton;
	//Singleton 이라는 type 의 singleton 변수 
	
	//1. 생성자를 외부에서 사용할 수 없도록 private으로 선언 
	private Singleton() { //원래 생성자는 public으로 만들어야되는데 private하면 외부에서 new 생성자를 못함. 
		System.out.println("singleton instance 생성");
		
	}
	
	//3. 객체가 heap에 있는지 확인 
	// 있으면 주소값 리턴, 없으면 새로운 객체 생성 
	public static Singleton getInstance() { // getInstance 라는 메소드
		if (singleton == null) {
			singleton = new Singleton(); // 원래 객체를 생성하는 방식대로 하는 이유는 getInstance로 불러온 값에 아직 아무것도 null 없어서 
			System.out.println("new!");
			
		}else {
			System.out.println("exist!!");
			
		}
		
		return singleton;
	}
	
}
