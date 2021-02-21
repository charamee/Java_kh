package com.test02;

public class MTest {

	public static void main(String[] args) {
		//sTest();
		sBufferTest();
		
	}
	// string 을 + 연산으로 연결할 때, 내부적으로 StringBuilder로 더해준다. (jdk1.5)
	public static void sTest() {
		//immutable
		String s = "안녕하세요.";
		System.out.println(s.hashCode());// hashCode 주소 
		s+="저는 "; //새로운 문자열 주소값이 생겨서 대입됨 
		System.out.println(s.hashCode());
		s+="차가람 입니다. "; // 마찬가지로 새로운 주소값이 생성된다. 
		System.out.println(s.hashCode());

		System.out.println(s);
		
		//안녕하세요 > 하이 
		System.out.println(s.replace("안녕하세요", "하이!"));
		System.out.println(s);// 대입을 안해줬기 떄문에 그대로 안녕하세요 
		System.out.println(s.hashCode()); //주소값 같음 
		s= s.replace("안녕하세요", "하이!"); // 대입 
		System.out.println(s);
		System.out.println(s.hashCode()); // 주소값 바뀜 
	}
	
	public static void sBufferTest() {
		//mutable 변할 수 있음. 
		StringBuffer sb = new StringBuffer();
		//method chaining. 
		sb.append("안녕하세요")
		.append("저는")
		.append("차가람입니다.");
		
	    System.out.println(sb.hashCode());
	    System.out.println(sb);
		
	    sb.replace(0,5,"하이!");
	    System.out.println(sb);
	    
	    //거꾸로 출력 
	   
	    sb.reverse();
	    System.out.println(sb);
	}
}
