package com.test01;

public class Type05 {
	/*
	 * 기본타입 (값 호출) -> 참조타입 : 기능을 사용할 수 있음 
	 *               Wrapper Class 
	 * byte -> Byte
	 * short ->Short
	 * int ->Integer
	 * long-> Long
	 * 
	 * float -> Float
	 * double -> Double
	 * 
	 * char ->Character
	 * 
	 * boolean -> Boolean
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("byte의 범위:"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short의 범위:"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		
		System.out.println("int의 범위:"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("long의 범위:"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		
		System.out.println("float의 범위:"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("double의 범위:"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
		System.out.println("char 크기:" + Character.SIZE);
	    System.out.println("boolean 거짓? :" +Boolean.FALSE);
	    
	    
	    
		
	}
}
