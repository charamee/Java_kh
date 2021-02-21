package com.test02;

public class MTest {

	public static void main(String[] args) {
		//Cat cat= new Cat();
		//Dog dog = new Dog();
		
		//cat.bark();
		//dog.bark();
		
		//출력하면 
		/*동물
		냥이
		동물
		멍멍이
		울음 소리 : 애옭 >> 울음소리: 이 나오는 이유는 부모의 bark 메소드를 통해 나오기 때문엥 
		울음 소리 : 멍멍
		*/
		
		Animal animal = new Dog(); // 부모타입에 자식 객체 dog 넣음 //자식은 부모 다쓸수이써
		animal.bark(); //dog호출
		
		animal= new Cat(); // cat 객체도 넣음 
		animal.bark();
		
		//instanceof : 해당 타입의 객체인지 아닌지 판별 / 왼쪽에 있는 변수의 값이 오른쪽에 있는 타입의 객체인지 아닌지 
		if (animal instanceof Dog) {
			System.out.println("멍멍이다!!");
		}else if (animal instanceof Cat) {
			System.out.println("냥냥이다!!!!!");
		}
		
		/*
		 * 다형성 
		 * 1. 부모의 타입으로 자식 생성 
		 * Parent p = new Child();
		 * 
		 * 2.부모의 이름으로 자식 대입 
		 * Child c = new Child();
		 * Parent p = c;
		 * 
		 * 3. 부모의 메소드를 통해 자식의 메소드 호출 
		 * 
		 * 같은 부모를 상속받은 자식 클래스는, 컴파일 시 형변환 가능한 것 처럼 작성되지만, 
		 * 실행시 (runtime)시 ClassCastException 을 발생시킴. 
		 */
	}
}
