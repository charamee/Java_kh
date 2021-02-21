package com.j02;

public class MTest {

	public static void main(String[] args) {
		MyMethod.myPublic();
		MyMethod.myProtectied();
		MyMethod.myDefault();
		//MyMethod.myPrivate();
		
		MyMethod mmt = new MyMethod(); 
		mmt.myNonStatic();
		//non- static 이다 얘네들은 
		// 메모리 영역중 heap 에 생성되기 떄문에 객체를 생성해줘야 한다. 
	}
}
