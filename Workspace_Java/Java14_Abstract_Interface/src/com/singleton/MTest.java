package com.singleton;

public class MTest {

	public static void main(String[] args) {
		
		//Singleton singleton= new Singleton(); 생성자가 private으로 만들어졌기 떄문에 
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s1.hashCode());// hashCode는 주소값 출력 
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		// getInstance 메소드를 이용하여 s1에  객체를 한번 new 만들어서 값에 저장 
		
		
		
		
		
		
		
		
		
		
	}
}
