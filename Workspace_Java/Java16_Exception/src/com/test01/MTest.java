package com.test01;

public class MTest {

	public static void main(String[] args) {
		
		ExceptionCal ec =new ExceptionCal();
		
		System.out.println(ec.calculation());
		//10,0 > Exception in thread "main" java.lang.ArithmeticException: / by zero 0으로 나누는건 불가능하다 ! 
	    //a, > java.util.InputMismatchException >> 프로그램을 강제로 종료함. 
	
	
	
	}
	

	
}
