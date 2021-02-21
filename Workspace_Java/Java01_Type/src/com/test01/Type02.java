package com.test01;

public class Type02 {

	//정수형 type: byte, short, int(정수형의 기본타입) , long
	public static void main(String[] args) {
		
		//type variable- literal; 
		//타입 변수 = 값 ; 
		byte b01 = 126;
		System.out.println(b01);
		b01 = 111;
		System.out.println(b01);
		
		byte b02 = (byte) 128; // 형 변환 128이 바이트보다 큰 숫자인데 앞에 (byte)를 추가해줌 : casting 이라고 함 
		System.out.println(b02);
		
		byte sumB = (byte) (b01 + b02); // 정수형 연산의 기본도 int 
		System.out.println(sumB);
		
		System.out.println("----------------");
		
		short s1 = 32767;
		System.out.println(s1);
		System.out.println("백수현 바보!");
		
		short s2 = 2;
		System.out.println(s2);
		
		short sumS = (short)(s1 + s2);
		System.out.println(sumS);
		
		System.out.println("----------------------");
		
		//int는 정수형의 기본타입이라 빨간줄이 안뜸 
		int i = 10;
		int j = 20;
		int sum = i + j;
		System.out.println(sum);
		i=30;
		sum=i+j;
	    System.out.println(sum);
		
		System.out.println("--------------");
		
		long l1=3000000000l;// 숫자 뒤에 l/L 추가 
		long l2=4000000000L;
		long sumL=l1+l2;
		System.out.println(sumL);
		
		
		//2진수(0b) 8진수(00) 16진수(0x) 
	    System.out.println(0b10);//2진수 10이라는 뜻 
	    System.out.println(0010);//8진수 10이라는 뜻 
	    System.out.println(0x10);//16진수 10이라는 뜻 
	    
		
		
		
	}
}