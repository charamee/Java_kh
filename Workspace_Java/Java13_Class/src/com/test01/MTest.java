package com.test01;

public class MTest {

	public static void main(String[] args) {
		AA a = new AA(); //new AA() 라는 객체 
		Super s= a; // Super s = new AA 랑 같은 말 Super s 에다가 a 가 가진 new AA()한 " instance"의 주소값 대임 
		//자식객체 AA는 부모타입에 넣을 수 있기 떄문에 AA타입의 a를 부모에 넣은것 
		//BB b= (BB) s; > s에 담긴 AA instance를 BB로 형변환 불가능 (자식간 형변환, 부모>자식 형변환 불가능. 오직 자식> 부모 형변환만 가능) 
		
		
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());// a와 s 의 해쉬코드가 같다는 것은 그 둘이 같은 객체라는 뜻 

	}
}
