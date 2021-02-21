package com.test02;

import com.test01.MethodTest01; // import : 다른 패키지에 있는 MethodTest01이라는 class를 가지고 와서 쓴다는 뜻 

public class MethodTest03 {

	public static void main(String[] args) {
		//1.static method 
		MethodTest01.publicMethod();
	   // MethodTest01.protectedMethod();//같은 패키지 내에서만 사용 가능 
	    //MethodTest01.defaultMethod();
	   // MethodTest01.privateMethod();
	    
		
		//2.non-static method 
		
		MethodTest01 test = new MethodTest01();
		test.nonStaticMethod();
		
		
	}
}
