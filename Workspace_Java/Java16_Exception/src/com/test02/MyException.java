
package com.test02;

public class MyException extends Exception {
	
	public MyException() { //기본생성자
		this("내가 만든 예외");
	}
	
	public MyException(String message) {
		super(message);
	}
	

}
