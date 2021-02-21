package com.aaa;


//public class AAA(extends Object) : 자바의 모든 class 는 Object 를 상속하고 있다 ! 
//extends 상속 
public class AAA { // 설계도 

	
	private int abc; //field 
	
	//default constructor (기본 생성자) : 만일 우리가 생성자를 하나도 만들지 않으면 자바 가상 머신 (JVM) 이 자동으로 만들어줌 
	// 만일 하나라도 만들어놓으면 자동생성 안됨. 
	public AAA() { //< 이게 생성자 
		System.out.println("AAA 생성");
	}
	
	//constructor : 필드 초기화 ,객체 생성
	public AAA(int abc) { //파라미터 1개짜리 생성자 
		//this : 나(객체) AAA paramA = new AAA(10); 여기서 param A 가 this
		this.abc=abc; // > 나 객체가 가진 인스턴스 변수 private int abc에 값 넣어주는것 
		System.out.println("AAA생성 > abc:"+abc);
	}
	
	// getter  &  setter
	public int getAbc() {
		return abc; // 외부에서 값 가져와 
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	
	public void prn() {
		System.out.println("AAA의 prn() 메소드");
	}
	
	
	
}

/*
 * 
  <생성자>
  1. 클래스 이름과 동일하디, 리턴타입은 없고, 객체 생성시 접근제한자는 public 
  //class Test{
    기본 생성자 
    public Test () {
    } 
   }
   
  2. 생성자는 객체 생성을 하는 new 키워드와 함께 사용되며, 생성시 단 한번만 자동 호출 된다. 
  // type 변수 = new 생성자 (); 
   Test t1 = new Test ();
   
     
     
  3. 메소드처럼 객체 및 클래스명으로 호출 될 수 없다. 
  t1.Test();  // 에러
  
 4. overload 할 수 있다. 
     class Test {
     public Test(){}                 // 기본 생성자
     public Test (int a ) {}
     public Test (int a, int b ) {}
  }
  
  5.생성자를 명시하지 않으면 기본 생성자가 제공되어 멤버변수(필드)를 초기화 하고, 
  명시된 생성자를 선언하게 되면 명시 생성자만 호출되고 기본생성자는 제공되지 않는다. 
  
  class AAA {}      // new AAA();
  class BBB { 
  public BBB(){}   // new BBB ();
  }
  class CCC{
   public CCC (int a){}  // new CCC(); X >> new CCC(10); 
   }
   
   6. 생성자는 상속되지 않는다. 
   7. 생성자는 내부 호출 할 수 있으며, 키워드는 this () 로 사용된다. 
   8. 생성자의 목적은 객체 생성 및 필드 초기화에 있다. 
   
  
  
  
 
  
 */

