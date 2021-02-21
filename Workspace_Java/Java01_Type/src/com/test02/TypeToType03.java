package com.test02;

public class TypeToType03 {

	public static void main(String[] args) {
		
	//boxing 기본타입에서 참조타입으로 가는것 
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(i.doubleValue());
		
		
		
		//unBoxing 참조타입에서 기본타입으로 가는것 
		//명시적 
		int j=i.intValue();
		System.out.println(j);
		//묵시적
		int k=i;//여기서 i 는 참조타입 
		System.out.println(k);
		
		
	}
	
	
	
	
}
