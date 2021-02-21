package com.test02;

public class TypeToType01 {

	
	public static void main(String[] args) {
		
		//1. int to char
		int i=65;
		char c= (char)i;
		System.out.println(c); //ASKII CODE 65는 A 
		
		
		//2. char to int;
		char c2='B';
		int i2=(int)c2;
		System.out.println(i2);
		
		
	    char c3='1'; // 숫자1이 아니라 문자형 1이기 때문에 아스키 표 49와 대응됨 
	    char c4='9'; // 마찬가지로 57로 대응 
	    int i3=c3+c4;
	    System.out.println(i3); // 49+57 > 106으로 값 나옴 
	    //3. String to int 
	    
	    String str="33";
	    System.out.println(str+1);
	    int i4=Integer.parseInt(str);// Integer 라는 class에 parseInt라는 기능 추가한것 (33이라는 문자를 숫자로 바꾼듯)
	    System.out.println(i4+1);
	    System.out.println("================");
	    //4.int to String 
	    
	    int i5=55;
	    System.out.println(i5+1);
	    String s5=Integer.toString(i5);
	    System.out.println(s5+1);
	    String s6=String.valueOf(i5);
	    System.out.println(s6+1);
	    
	    
	    
	    
	    
	    
	    
	}
	
}
