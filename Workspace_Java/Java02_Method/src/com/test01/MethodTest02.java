package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		//method 호출 방법
		// 1. static method : class.method(); 
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();not visible > 보이지 않아, 범위가 아니야 private method는 해당 class 내에서만 가능 
	    //MethodTest01.abc(); undefined > 없어. 
	    
		
		//2.non-static method 
		//class (참조타입) 변수= new class(); 
		//변수.method();
		MethodTest01 nonstatic= new MethodTest01();// < 값(객체) 
		nonstatic.nonStaticMethod();
		
	    //objectaid 
		//UML : Unified Modeling Language 
		
	}
	
}
